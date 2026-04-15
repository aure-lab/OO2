package Ejercicio4.SubteWay;

public class SinTACCBuilder extends SandwichBuilder {
	
	public SinTACCBuilder () {
		super();
	}

	@Override
	public void buildPan() {
		this.sandwich.agregarIngrediente(new Ingrediente ("Pan de chipa", 150));
		
	}

	@Override
	public void buildPrincipal() {
		this.sandwich.agregarIngrediente(new Ingrediente ("Carne de pollo", 250));
	}

	@Override
	public void buildAderezo() {
		this.sandwich.agregarIngrediente(new Ingrediente("Salsa tartara", 18));
	}

	@Override
	public void buildAdicinal() {
		this.sandwich.agregarIngrediente(new Ingrediente("Verduras grilladas", 200));
		
	}

}
