package Ejercicio3.Empleados;

public class Temporario extends PorContrato {
	private static final double precioPorHora = 300;
	private static final double sueldoBase = 20000;
	
	private int cantHoras;
	
	public Temporario (int cantHijos, boolean estaCasado, int cantHoras) {
		super(cantHijos,estaCasado);
		this.cantHoras = cantHoras;
	}

	@Override
	protected double obtenerSueldoBasico() {
		return Temporario.sueldoBase + (this.cantHoras * Temporario.precioPorHora);
	}

	@Override
	protected double obtenerSueldoAdicional() {
		return this.calculoIntermedioSueldoAdicional();
	}

}
