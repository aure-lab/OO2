package Ejercicio18.ConstruccionDePersonajes;

public class DirectorDePersonaje {
	private Creador creador;
	
	public DirectorDePersonaje (Creador creador) {
		this.creador = creador;
	}
	
	public Personaje crear () {
		this.creador.reset();
		this.creador.setArma();
		this.creador.setArmadura();
		this.creador.setHabilidades();
		return this.creador.getResult();
	}
	
}
