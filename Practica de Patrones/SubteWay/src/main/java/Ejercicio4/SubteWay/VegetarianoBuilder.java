package Ejercicio4.SubteWay;

public class VegetarianoBuilder extends SandwichBuilder {
	
	public VegetarianoBuilder () {
		super();
	}

	@Override
	public void buildPan() {
		this.sandwich.agregarIngrediente(new Ingrediente("Pan con semillas", 120));
		
	}

	@Override
	public void buildPrincipal() {
		this.sandwich.agregarIngrediente(new Ingrediente ("Provoleta grillada", 200));
		
	}

	@Override
	public void buildAderezo() { //que hago?????
	}

	@Override
	public void buildAdicinal() {
		this.sandwich.agregarIngrediente(new Ingrediente("Berenjenas al escabeche", 200));
		
	}

}
