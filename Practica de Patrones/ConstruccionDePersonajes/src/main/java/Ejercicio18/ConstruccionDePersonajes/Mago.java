package Ejercicio18.ConstruccionDePersonajes;

import java.util.LinkedList;
import java.util.List;

public class Mago extends Creador{

	@Override
	public void setArma() {
		this.pj.setArma(new Baston());
	}

	@Override
	public void setArmadura() {
		this.pj.setArmadura(new Cuero());
	}

	@Override
	public void setHabilidades() {
		List<String> l  = new LinkedList<>();
		l.add("Experto en magia");
		l.add("Combate a distancia");
		pj.setHabilidades(l);
	}

}
