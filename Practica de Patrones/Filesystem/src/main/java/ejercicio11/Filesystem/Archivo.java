package ejercicio11.Filesystem;

import java.util.LinkedList;
import java.util.List;

public class Archivo extends Elemento {
	
	private int tamaño;
	
	public Archivo(String nombre, int tamaño) {
		super(nombre);
		this.tamaño = tamaño;
	}

	@Override
	public int getTamaño() {
		return this.tamaño;
	}

	@Override
	public Archivo masNuevo() {
		return this;
	}

	@Override
	public Archivo masPesado() {
		return this;
	}

	@Override
	public List<Elemento> todasLasCoincicidencias(String nombre) {
		List<Elemento> l = new LinkedList<>();
		if (this.iguales(nombre))
			l.add(this);
		return l;
	}
	
	

	
	

}
