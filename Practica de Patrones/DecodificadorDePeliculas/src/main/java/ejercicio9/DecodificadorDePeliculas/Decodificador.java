package ejercicio9.DecodificadorDePeliculas;

import java.util.*;

public class Decodificador {
	private List<Pelicula> grilla;
	private List<Pelicula> pelisVistas;
	private Configuracion configuracion;
	
	public Decodificador (List<Pelicula> grilla, List<Pelicula>pelisVistas, Configuracion configuracion) {
		this.grilla = grilla;
		this.pelisVistas = pelisVistas;
		this.configuracion = configuracion;
	}
	
	public List<Pelicula> ofrecer() {
		return this.configuracion.aplicarCriterio(this);
	}
	
	public void cambiarConfiguracion (Configuracion configuracion) {
		this.configuracion = configuracion;
	}

	public List<Pelicula> getGrilla() {
		return new LinkedList<Pelicula>(grilla);
	}
	
	public boolean vista (Pelicula peli) {
		return this.pelisVistas.contains(peli);
	}
	
}
