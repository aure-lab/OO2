package Ejercicio18.ConstruccionDePersonajes;

public abstract class Creador {
	protected Personaje pj;
	
	public abstract void setArma();
	public abstract void setArmadura();
	public abstract void setHabilidades();
	public void reset() {
		this.pj = new Personaje();
	}
	public Personaje getResult() {
		return this.pj;
	}
	
}
