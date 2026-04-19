package ejercicio10.Calculadora;

public class Restando extends Esperando{

	public Restando(Calculadora calc) {
		super(calc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void SetValor(double valor) {
		this.calc.resultado -= valor;
		this.calc.estado = new Inicial(this.calc);
		
	}

}
