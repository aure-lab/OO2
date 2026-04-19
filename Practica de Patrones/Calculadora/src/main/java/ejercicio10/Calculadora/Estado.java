package ejercicio10.Calculadora;

public abstract class Estado {
	protected Calculadora calc;
	
	public Estado (Calculadora calc) {
		this.calc = calc;
	}
	
	public abstract void SetValor(double valor);
	public abstract void mas();
	public abstract void menos();
	public abstract void por();
	public abstract void dividido();
	public abstract String getResultado();
}
