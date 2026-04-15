package Ejercicio4.SubteWay;

public class ClasicoBuilder extends SandwichBuilder{
	
	public ClasicoBuilder () {
		super();
	}

	@Override
	public void buildPan() {
		this.sandwich.agregarIngrediente(new Ingrediente ("Pan Brioche", 100));		
	}

	@Override
	public void buildPrincipal() {
		this.sandwich.agregarIngrediente(new Ingrediente ("Carne ternera", 300));
		
	}

	@Override
	public void buildAderezo() {
		this.sandwich.agregarIngrediente(new Ingrediente ("Mayonesa", 20));
		
	}

	@Override
	public void buildAdicinal() {
		this.sandwich.agregarIngrediente(new Ingrediente ("Tomate", 80));
		
	}

}
