package ejercicio10.Calculadora;

public class Sumando extends Esperando{

	public Sumando(Calculadora calc) {
		super(calc);
	}

	@Override
	public void SetValor(double valor) {
		this.calc.resultado += valor;
		this.calc.estado = new Inicial(this.calc);
	}

}
