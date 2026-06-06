package Ejercicio18.ConstruccionDePersonajes;

public class Cuero implements Armadura{

	@Override
	public int recibirDañoDeEspada() {
		return 8;
	}

	@Override
	public int recibirDañoDeArco() {
		return 5;
	}

	@Override
	public int recibirDañoDeBaston() {
		return 2;
	}

}
