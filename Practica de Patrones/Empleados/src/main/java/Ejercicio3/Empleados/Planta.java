package Ejercicio3.Empleados;

import java.time.LocalDate;
import java.time.Period;

public class Planta extends PorContrato{

	private static final double precioPorAño = 2000;
	private static final double sueldoBase = 50000;
	
	private LocalDate fechaIngreso;

	public Planta(int cantHijos, boolean estaCasado, LocalDate fechaIngreso) {
		super(cantHijos, estaCasado);
		this.fechaIngreso = fechaIngreso;
	}
	
	@Override
	protected double obtenerSueldoBasico() {
		return Planta.sueldoBase;
	}

	@Override
	protected double obtenerSueldoAdicional() {
		return this.calculoIntermedioSueldoAdicional() + this.getAntiguedad() * Planta.precioPorAño;
	}
	
	private int getAntiguedad () {
		return Period.between(fechaIngreso, LocalDate.now()).getYears();
	}

}
