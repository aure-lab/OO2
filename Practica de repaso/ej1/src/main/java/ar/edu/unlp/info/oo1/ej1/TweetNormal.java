package ar.edu.unlp.info.oo1.ej1;

public class TweetNormal implements Tweet {
	private String texto;
	
	public TweetNormal (String texto) {
		if (texto.length()>=1 && texto.length()>= 280)
			this.texto = texto;
	}
	
	public boolean contieneTexto() {
		return this.texto == null;
	}
	
	public boolean esIgual(String texto) {
		return this.texto == texto;
	}

}
