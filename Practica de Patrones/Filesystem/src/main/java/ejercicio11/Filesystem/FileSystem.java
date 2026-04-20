package ejercicio11.Filesystem;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FileSystem {
	private List<Elemento> elementos;
	
		  public int tamanoTotalOcupado() {
			  return this.elementos.stream().mapToInt(E -> E.getTamaño()).sum();
		  }

		  /**
		   * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
		   * filesystem 
		   */
		  public Archivo archivoMasGrande() {
			  return this.elementos.stream().map(E -> E.masPesado()).
					  max(Comparator.comparing(Archivo :: getTamaño)).orElse(null);
		  }

		  /**
		   * Retorna el archivo con fecha de creación más reciente en cualquier nivel 
		   * del filesystem
		   */
		  public Archivo archivoMasNuevo() {
			  return this.elementos.stream().map(E -> E.masNuevo()).
					  max(Comparator.comparing(Archivo :: getFechaDeCreacion)).orElse(null);
		  }

		  /**
		   * Retorna el primer elemento con el nombre solicitado contenido en cualquier
		   * nivel del filesystem
		   */
		  public Elemento buscar(String nombre){
			  return this.elementos.stream().filter(E -> E.iguales(nombre)).findFirst().orElse(null);
		  }

		  /**
		   * Retorna la lista con los elementos que coinciden con el nombre solicitado 
		   * contenido en cualquier nivel del filesystem
		   */
		  public List<Elemento> buscarTodos(String nombre){
			  List<Elemento> l = new LinkedList<>();
			  this.elementos.stream().forEach(E -> l.addAll(E.todasLasCoincicidencias(nombre)));
			  return l;
		  }

		  /**
		   * Retorna un String con los nombres de los elementos contenidos en todos los 
		   * niveles del filesystem. De cada elemento debe retornar el path completo
		   * (similar al comando pwd de linux) siguiendo el modelo presentado a
		   * continuación
		/Directorio A
		/Directorio A/Directorio A.1
		/Directorio A/Directorio A.1/Directorio A.1.1
		/Directorio A/Directorio A.1/Directorio A.1.2 	
		/Directorio A/Directorio A.2
		/Directorio B
		   */
		  public String listadoDeContenido() {
			  return this.elementos.stream().map(e -> e.toString())
		        .collect(Collectors.joining());
		  }


}
