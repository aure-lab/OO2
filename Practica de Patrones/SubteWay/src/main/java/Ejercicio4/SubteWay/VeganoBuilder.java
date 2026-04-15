package Ejercicio4.SubteWay;

public class VeganoBuilder extends SandwichBuilder{
	
	public VeganoBuilder () {
		super();
	}

	@Override
	public void buildPan() {
		this.sandwich.agregarIngrediente(new Ingrediente("Integral", 100));	
	}

	@Override
	public void buildPrincipal() {
		this.sandwich.agregarIngrediente(new Ingrediente("Milanesa de girgolas", 500));
	}

	@Override
	public void buildAderezo() {
		this.sandwich.agregarIngrediente(new Ingrediente("Salsa criolla", 20));
	}

	@Override
	public void buildAdicinal() {
		this.sandwich.agregarIngrediente(null);
	}
	
	

}
