package Parcial.Documento;

import com.sun.java.accessibility.util.Translator;

public class Parrafo implements Elemento{
	private String texto;
	
	public Parrafo (String texto) {
		this.texto = texto;
	}
	
	public String toString () {
		return this.texto + "\n";
	}

	@Override
	public Elemento traducir() {
		return new Parrafo(Translator.tanslate(this.texto));	
	}

	@Override
	public boolean buscar(String texto) {
		return this.texto.contains(texto);
	}

}
