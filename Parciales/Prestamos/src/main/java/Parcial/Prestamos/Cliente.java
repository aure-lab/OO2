package Parcial.Prestamos;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
	private String nombre;
	private double salario;
	private List<Prestamo> prestamos;
	
	public Cliente (String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
		this.prestamos = new LinkedList<>();
	}
	
	public void agregarPrestamo (Prestamo prestamo) {
		this.prestamos.add(prestamo);
	}

	protected String getNombre() {
		return nombre;
	}

	protected double getSalario() {
		return salario;
	}

	protected List<Prestamo> getPrestamos() {
		return prestamos;
	}
	
	
	

	
}
