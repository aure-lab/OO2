package ejercicio9.DecodificadorDePeliculas;

import java.util.List;

public class Similaridad implements Configuracion{

	@Override
	public List<Pelicula> aplicarCriterio(Decodificador decodificador) {
		return decodificador.getGrilla().stream()
				.filter(p -> decodificador.vista(p)).flatMap(p -> p.getSimilares().stream())
				.limit(3).toList();
	}

}
