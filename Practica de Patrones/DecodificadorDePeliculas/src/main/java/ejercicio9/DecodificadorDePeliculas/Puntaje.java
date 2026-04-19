package ejercicio9.DecodificadorDePeliculas;

import java.util.Comparator;
import java.util.List;

public class Puntaje implements Configuracion {

	@Override
	public List<Pelicula> aplicarCriterio(Decodificador decodificador) {
		return decodificador.getGrilla().stream()
				.filter(p -> !(decodificador.vista(p)))
				.sorted(Comparator.comparing(Pelicula::getPuntaje).thenComparing(Pelicula::getAño)).limit(3).toList();
	}
	
	
}
