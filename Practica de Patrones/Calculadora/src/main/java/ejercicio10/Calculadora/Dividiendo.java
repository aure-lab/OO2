package ejercicio10.Calculadora;

public class Dividiendo extends Esperando {

	public Dividiendo(Calculadora calc) {
		super(calc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void SetValor(double valor) {
		if (valor == 0)
			this.calc.estado = new Error(this.calc);
		else {
			this.calc.resultado = this.calc.resultado / valor;
			this.calc.estado = new Inicial(this.calc);
		}
		
	}

}
