package Ejercicio18.ConstruccionDePersonajes;

public class Baston implements Arma {

	@Override
	public int golpear(Armadura a) {
		return a.recibirDañoDeBaston();
	}

}
