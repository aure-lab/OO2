package Ejercicio4.Topografias;

import java.util.List;

public class Mixta implements Topografia{
	private List<Topografia> topografias;
	
	public Mixta (List<Topografia> t) {
		if (t.size() == 4)
			this.topografias = t;
		else 
			throw new IllegalArgumentException ("La cantidad de elementos deben ser exactamente 4");
	}

	@Override
	public double proporcionDeAgua() {
		return this.topografias.stream().mapToDouble(t -> t.proporcionDeAgua()).sum()
				/4;
	}

	@Override
	public double proporcionDeTierra() {
		return this.topografias.stream().mapToDouble(t -> t.proporcionDeTierra()).sum()
				/4;
	}

	@Override
	public boolean equals(Topografia t) {
		return t.esMixta(this);
	}

	public boolean esMixta (Mixta t) {
		return t.topografias.equals(this.topografias);
	}
	

	
	
	
}
