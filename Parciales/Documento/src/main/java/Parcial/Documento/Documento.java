package Parcial.Documento;

import com.sun.java.accessibility.util.Translator;

public class Documento {
	private String titulo;
	private String autor;
	private Seccion seccionRaiz;
	
	public Documento (String titulo, String autor, Seccion seccionRaiz) {
		this.titulo = titulo;
		this.autor = autor;
		this.seccionRaiz = seccionRaiz;
		
	}
	
	public String toString() {
		return this.titulo + "-" + this.autor + "\n" + this.seccionRaiz.toString();
	}
	
	public boolean buscar (String texto) {
		return this.seccionRaiz.buscar(texto);
	}
	
	public Documento traducir() {
		return new Documento (Translator.translate(this.titulo), Translator.translate(this.titulo), this.seccionRaiz.traducir());
	}
}
