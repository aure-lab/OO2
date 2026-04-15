package Ejercicio4.Topografias;

public interface Topografia {
	
	public double proporcionDeAgua ();
	
	public double proporcionDeTierra();

	public boolean equals (Topografia t);
	
	public boolean esMixta(Mixta t);
}

