package Ejercicio18.ConstruccionDePersonajes;

public class Espada implements Arma {

	@Override
	public int golpear(Armadura a) {
		return a.recibirDañoDeEspada();
	}
	
}
