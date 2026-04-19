package ejercicio10.Calculadora;

public class Inicial extends Estado {

	public Inicial(Calculadora calc) {
		super(calc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void SetValor(double valor) {
		this.calc.resultado = valor;
		
	}

	@Override
	public void mas() {
		this.calc.estado = new Sumando(this.calc);
		
	}

	@Override
	public void menos() {
		this.calc.estado = new Restando(this.calc);
		
	}

	@Override
	public void por() {
		this.calc.estado = new Multiplicando(this.calc);
		
	}

	@Override
	public void dividido() {
		this.calc.estado = new Dividiendo(this.calc);
		
	}

	@Override
	public String getResultado() {
		return Double.toString(this.calc.resultado);
	}

}
