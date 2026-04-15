package Ejercicio4.Topografias;

public class Tierra implements Topografia{

	@Override
	public double proporcionDeAgua() {
		return 0;
	}

	@Override
	public double proporcionDeTierra() {
		return 1;
	}

	@Override
	public boolean equals(Topografia t) {
		return this.proporcionDeTierra() == t.proporcionDeTierra();
	}
	
	public boolean esMixta(Mixta t) {
		return false;
	}

}
