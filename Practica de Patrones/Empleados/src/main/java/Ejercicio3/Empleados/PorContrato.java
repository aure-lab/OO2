package Ejercicio3.Empleados;

public abstract class PorContrato extends Empleado{
	private static final double precioPorEstarCasado = 5000;
	private static final double precioPorHijo = 2000;
	
	private int cantiHijos;
	private  boolean estaCasado;
	
	public PorContrato (int cantHijos, boolean estaCasado) {
		this.cantiHijos = cantHijos;
		this.estaCasado = estaCasado;
	}
	
	protected double calculoIntermedioSueldoAdicional() {
		return this.estaCasado ? 
				this.precioTotalXHijos() + PorContrato.precioPorEstarCasado : 
					cantiHijos * this.precioTotalXHijos();
	}
	
	private double precioTotalXHijos() {
		return this.cantiHijos * PorContrato.precioPorHijo;
	}
}
