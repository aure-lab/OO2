package Parcial.Prestamos;

public class Aceptado implements Estado{

	@Override
	public void pagarCuota(Prestamo prestamo) {
		prestamo.registrarPago();
		if (prestamo.seAbonoCompleto())
			prestamo.setEstado(new Finalizado());
	}

	@Override
	public double gastosDeCancelacion(Prestamo prestamo) {
		return prestamo.getGastoAdministrativo() + prestamo.getValorSellado();
	}

}
