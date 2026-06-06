package Parcial.Documento;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sun.java.accessibility.util.Translator;

public class LIstaOrdenada implements Elemento {
	private List<String> lista = new LinkedList<>();
	
	public String toString () {
		return this.lista.stream().map( t ->this.format(t)).collect(Collectors.joining());
	}
	
	private String format(String texto ) {
		return  (this.lista.indexOf(texto) + 1) + ". " + texto + "\n";
	}
	@Override
	public boolean buscar(String texto) {
		return this.lista.stream().anyMatch(t -> t.contains(texto));
	}
	
	public void agregarItem (String texto) {
		this.lista.add(texto);
	}

	@Override
	public Elemento traducir() {
		LIstaOrdenada doble = new LIstaOrdenada();
		this.lista.stream().forEach(t -> doble.agregarItem(Translator.translate(t)));
		return doble;
	}

}
