package Ejercicio4.Topografias;

public class Agua implements Topografia {

	@Override
	public double proporcionDeAgua() {
		return 1;
	}

	@Override
	public double proporcionDeTierra() {
		return 0;
	}

	@Override
	public boolean equals(Topografia t) {
		return this.proporcionDeAgua() == t.proporcionDeAgua();
	}
	
	public boolean esMixta(Mixta t) {
		return false;
	}
	
	

}
