package Ejercicio3.Empleados;

public class Pasante extends Empleado{
	private static final double sueldoBase = 20000;
	private static final double pagoXExamen = 2000;
	private int cantExamenes;
	
	public Pasante (int cantExamenes) {
		this.cantExamenes = cantExamenes;
	}

	@Override
	protected double obtenerSueldoBasico() {
		return Pasante.sueldoBase;
	}

	@Override
	protected double obtenerSueldoAdicional() {
		return this.cantExamenes * Pasante.pagoXExamen;
	}

}
