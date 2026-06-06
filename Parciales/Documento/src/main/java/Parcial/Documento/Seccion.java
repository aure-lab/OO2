package Parcial.Documento;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.sun.java.accessibility.util.Translator;

public class Seccion implements Elemento{
	private String titulo;
	private List<Elemento> lista;
	
	public Seccion (String titulo) {
		this.titulo = titulo;
		this.lista = new LinkedList<>();
	}
	
	public String toString () {
		return "### " + this.titulo + "\n" +this.lista.stream().map(e-> e.toString()).collect(Collectors.joining());
	}

	@Override
	public Elemento traducir() {
		Seccion doble = new Seccion (Translator.translate(this.titulo));
		this.lista.stream().forEach(e -> doble.addChild(e.traducir()));
		return doble;
	}

	@Override
	public boolean buscar(String texto) {
		return this.titulo.contains(texto) || this.lista.stream().anyMatch(e -> e.buscar(texto));
	}
	
	
	public List<Elemento> getChildren() {
		return this.lista;
	}
	
	public void addChild(Elemento elem) {
		this.lista.add(elem);
	}
	
	public void removeChild (Elemento elem) {
		this.lista.remove(elem);
	}
	
	
	
	
	
	
	
}
