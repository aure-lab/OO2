package Ejercicio18.ConstruccionDePersonajes;

import java.util.List;

public class Personaje {
	private Arma arma;
	private Armadura armadura;
	private int HP = 100;
	private List<String> habilidades;

	protected void setArma(Arma arma) {
		this.arma = arma;
	}

	protected void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}
	
	public void setHabilidades (List<String> habilidades) {
		this.habilidades = habilidades;
	}
	
	public void decrementarVida(int HP) {
		this.HP -= HP;
	}
	
	public Armadura getArmadura () {
		return this.armadura;
	}
	
	public boolean pelearContra (Personaje pj) {
		if (this.HP > 0) {
			pj.decrementarVida(this.arma.golpear(pj.getArmadura()));
			return !pj.pelearContra(this);
		}
		return false;
	}
	
	public void reset () {
		this.HP = 100;
	}
}
