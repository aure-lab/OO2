package Ejercicio18.ConstruccionDePersonajes;

import java.util.LinkedList;

public class Arquero extends Creador {

	@Override
	public void setArma() {
		this.pj.setArma(new Arco());
		
	}

	@Override
	public void setArmadura() {
		this.pj.setArmadura(new Cuero());
	}

	@Override
	public void setHabilidades() {
		LinkedList <String> l = new LinkedList<>();
		l.add("Especialista en disparos con felchas");
		this.pj.setHabilidades(l);
	}

}
