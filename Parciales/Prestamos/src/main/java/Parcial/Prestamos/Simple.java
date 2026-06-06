package Parcial.Prestamos;

public class Simple extends Prestamo {
	private double interes;

	public Simple(double monto, int cantidadDeCuotas, Cliente cliente, double interes) {
		super(monto, cantidadDeCuotas, cliente);
		this.interes = interes;
	}

	@Override
	public double getInteres() {
		return this.interes;
	}

	@Override
	public double montoPagado() {
		return this.getValorNetoCuota() * this.cuotasPagadas;
	}

	@Override
	public double getValorSellado() {
		return 5000;
	}

}
