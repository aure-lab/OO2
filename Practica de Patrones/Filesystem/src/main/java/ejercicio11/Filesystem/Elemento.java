package ejercicio11.Filesystem;

import java.time.LocalDate;
import java.util.*;

public abstract class Elemento {
	protected String nombre;
	protected LocalDate fechaDeCreacion;

	public Elemento (String nombre) {
		this.nombre = nombre;
		this.fechaDeCreacion = LocalDate.now();
	}
	
	public abstract int getTamaño ();
	
	public abstract Archivo masNuevo();
	
	public abstract Archivo masPesado();
	
	public boolean iguales(String nombre) {
		return nombre.equals(this.nombre);
	}
	
	public LocalDate getFechaDeCreacion() {
		return this.fechaDeCreacion;
	}
	
	public String toString () {
		return this.nombre + "/ \n";		
	}
	
	public abstract List<Elemento> todasLasCoincicidencias(String nombre);
}
