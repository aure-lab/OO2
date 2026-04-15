package Ejercicio4.SubteWay;

import java.util.LinkedList;
import java.util.List;

public class Sandwich {
	private List<Ingrediente> ingredientes;
	
	public Sandwich () {
		this.ingredientes = new LinkedList<>();
	}
	
	public double getTotal () {
		return this.ingredientes.stream().mapToDouble(i -> i.getPrecio()).sum();
	}
	
	public void agregarIngrediente(Ingrediente i) {
		this.ingredientes.add(i);
	}
}
