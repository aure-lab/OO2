package Ejercicio3.Empleados;

public abstract class Empleado {
	private static final double descuentoBasico = 0.13;
	private static final double descuentoAdicional = 0.05;
	
	protected double sueldo () {
		return this.obtenerSueldoBasico() +
				this.obtenerSueldoAdicional() -
				this.obtenerDescuento();
	}
	
	protected abstract double  obtenerSueldoBasico();
	
	protected abstract double  obtenerSueldoAdicional ();
	
	protected double obtenerDescuento () {
		return (this.obtenerSueldoBasico() * Empleado.descuentoBasico) + 
				(this.obtenerSueldoAdicional() * Empleado.descuentoAdicional);
	}


}
