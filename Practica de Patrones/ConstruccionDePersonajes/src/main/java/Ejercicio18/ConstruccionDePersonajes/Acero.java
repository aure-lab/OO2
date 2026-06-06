package Ejercicio18.ConstruccionDePersonajes;

public class Acero implements Armadura {
	
	@Override
	public int recibirDañoDeEspada() {
		return 3;
	}

	@Override
	public int recibirDañoDeArco() {
		return 2;
	}

	@Override
	public int recibirDañoDeBaston() {
		return 1;
	}
}
