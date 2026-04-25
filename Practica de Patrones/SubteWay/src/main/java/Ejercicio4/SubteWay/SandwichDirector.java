package Ejercicio4.SubteWay;

public class SandwichDirector {
	private SandwichBuilder sandwichBuilder;
	
	public SandwichDirector (SandwichBuilder sandwichBuilder) {
		this.sandwichBuilder = sandwichBuilder;
	}
	
	public Sandwich construct () {
		this.sandwichBuilder.reset();
		this.sandwichBuilder.buildPan();
		this.sandwichBuilder.buildAderezo();
		this.sandwichBuilder.buildPrincipal();
		this.sandwichBuilder.buildAdicinal();
		return this.sandwichBuilder.getResult();
	}
}
