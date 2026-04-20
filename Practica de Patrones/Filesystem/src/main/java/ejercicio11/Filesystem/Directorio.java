package ejercicio11.Filesystem;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends Elemento{
	private List<Elemento> contenido;

	public Directorio(String nombre) {
		super(nombre);
		this.contenido = new LinkedList<>();
	}


	@Override
	public int getTamaño() {
		return this.contenido.stream().mapToInt(E -> E.getTamaño()).sum() + 32;
	}


	@Override
	public Archivo masNuevo() {	
		return this.contenido.stream().map(E -> E.masNuevo()).max(Comparator.comparing(Archivo :: getFechaDeCreacion)).orElse(null);
	}


	@Override
	public Archivo masPesado() {
			return this.contenido.stream().map(E -> E.masPesado()).max(Comparator.comparing(Archivo :: getTamaño)).orElse(null);
	}
	
	@Override 
	public String toString() {
		return super.toString() + this.contenido.stream()
        .map(e -> super.toString() + e.toString())
        .collect(Collectors.joining());
	}


	@Override
	public List<Elemento> todasLasCoincicidencias(String nombre) {
		List<Elemento> l = new LinkedList<>();
		if (this.iguales(nombre))	//Esto es igual en ambos, vale la pena un template method??
			l.add(this);
		this.contenido.stream().forEach(E -> l.addAll(E.todasLasCoincicidencias(nombre)));
		return l;
	}

	
	
	
	
	
}
