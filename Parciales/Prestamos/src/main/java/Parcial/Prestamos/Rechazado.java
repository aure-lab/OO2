package Parcial.Prestamos;

public class Rechazado implements Estado{

	@Override
	public void pagarCuota(Prestamo prestamo) {
		throw new Error ("Error");
		
	}

	@Override
	public double gastosDeCancelacion(Prestamo prestamo) {
		throw new Error ("Error");
	}

}
