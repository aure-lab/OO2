package Ejercicio18.ConstruccionDePersonajes;

public class Hierro implements Armadura {

	@Override
	public int recibirDañoDeEspada() {
		return 5;
	}

	@Override
	public int recibirDañoDeArco() {
		return 3;
	}

	@Override
	public int recibirDañoDeBaston() {
		return 1;
	}
}
