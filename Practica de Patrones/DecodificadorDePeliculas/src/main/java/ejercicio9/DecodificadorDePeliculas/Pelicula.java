package ejercicio9.DecodificadorDePeliculas;

import java.util.LinkedList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private int año;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula (int año, String titulo, double puntaje, List<Pelicula> similares) {
		this.año = año;
		this.titulo = titulo;
		this.puntaje = puntaje;
		this.similares = similares;
	}
	public String getTitulo() {
		return titulo;
	}

	public int getAño() {
		return año;
	}

	public double getPuntaje() {
		return puntaje;
	}
	
	public List<Pelicula> getSimilares (){
		return new LinkedList <Pelicula>(this.similares);
	}
	
	
	
}