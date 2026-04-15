package Ejercicio4.SubteWay;

public abstract class SandwichBuilder {
	protected Sandwich sandwich;
	
	public SandwichBuilder() {
		this.sandwich = new Sandwich();
	}
	
	public abstract void buildPan();
	
	public abstract void buildPrincipal();
	
	public abstract void buildAderezo();
	
	public abstract void buildAdicinal();
	
	public Sandwich getResult () {
		return this.sandwich;
	}

}
