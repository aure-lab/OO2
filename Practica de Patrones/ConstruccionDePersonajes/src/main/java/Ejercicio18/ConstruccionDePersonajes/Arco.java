package Ejercicio18.ConstruccionDePersonajes;

public class Arco implements Arma{

	@Override
	public int golpear(Armadura a) {
		return a.recibirDañoDeArco();
	}

}
