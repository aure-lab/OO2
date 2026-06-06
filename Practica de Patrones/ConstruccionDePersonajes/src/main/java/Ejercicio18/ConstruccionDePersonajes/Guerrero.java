package Ejercicio18.ConstruccionDePersonajes;

import java.util.LinkedList;

public class Guerrero extends Creador {

	@Override
	public void setArma() {
		this.pj.setArma(new Espada());
		
	}

	@Override
	public void setArmadura() {
		this.pj.setArmadura(new Acero());
		
	}

	@Override
	public void setHabilidades() {
		LinkedList <String> l = new LinkedList<>();
		l.add("Combate cuerpo a cuerpo");
		this.pj.setHabilidades(l);
		
	}

}
