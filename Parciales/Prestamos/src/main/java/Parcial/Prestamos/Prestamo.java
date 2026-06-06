package Parcial.Prestamos;

public abstract class Prestamo {
	protected double monto;
	protected int cantidadDeCuotas;
	protected int cuotasPagadas;
	private Estado estado;
	
	public Prestamo (double monto, int cantidadDeCuotas, Cliente cliente) {
		this.monto = monto; 
		this.cantidadDeCuotas = cantidadDeCuotas;
		cliente.agregarPrestamo(this);
		if (cliente.getSalario()*0.3 < this.monto)
			this.estado = new Rechazado();
		else this.estado = new Aceptado();
	}
	
	public double valorCuota () {
		return this.getValorNetoCuota() * this.getInteres();
	}
	
	public double getValorNetoCuota() {
		return this.monto / this.cantidadDeCuotas;
	}
	
	public abstract double getInteres();

	public abstract double montoPagado();
	
	public double montoRestante() {
		return this.valorCuota() * (this.cantidadDeCuotas - this.cuotasPagadas);
	}
	
	public boolean seAbonoCompleto() {
		return this.cantidadDeCuotas == this.cuotasPagadas;
	}
	
	public void pagarCuota() {
		this.estado.pagarCuota(this);
	}
	
	public void registrarPago() {
		this.cuotasPagadas++;
	}
	
	public void setEstado (Estado estado) {
		this.estado = estado;
	}
	
	public double getGastoAdministrativo() {
		return this.montoRestante() * 0.1;
	}
	
	public abstract double getValorSellado();
	
	
	
	
	
	
	
	
	
	
}
