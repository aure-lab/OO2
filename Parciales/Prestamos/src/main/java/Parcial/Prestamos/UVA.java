package Parcial.Prestamos;
import java.util.*;
public class UVA extends Prestamo{
	private List<Double> cuotas;

	public UVA(double monto, int cantidadDeCuotas, Cliente cliente) {
		super(monto, cantidadDeCuotas, cliente);
		this.cuotas = new LinkedList<>();
	}

	@Override
	public double getInteres() {
		return Indec.getIndiceInflacion();
	}

	@Override
	public double montoPagado() {
		return this.cuotas.stream().mapToDouble(c -> c).sum();
	}

	@Override
	public double getValorSellado() {
		return 0;
	}
	
	@Override
	public void registrarPago() {
		super.registrarPago();
		this.cuotas.add(this.valorCuota());
	}

}
