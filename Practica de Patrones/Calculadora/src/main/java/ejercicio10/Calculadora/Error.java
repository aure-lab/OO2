package ejercicio10.Calculadora;

public class Error extends Estado {

	public Error(Calculadora calc) {
		super(calc);
	}

	@Override
	public void SetValor(double valor) {
		
	}

	@Override
	public void mas() {
		
	}

	@Override
	public void menos() {
		
	}

	@Override
	public void por() {
		
	}

	@Override
	public void dividido() {
		
	}

	@Override
	public String getResultado() {
		return "Error.";
	}

}
