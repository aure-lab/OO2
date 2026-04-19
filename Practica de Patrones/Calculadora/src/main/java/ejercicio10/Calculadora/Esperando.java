package ejercicio10.Calculadora;

public abstract class Esperando extends Estado {

	public Esperando(Calculadora calc) {
		super(calc);
	}
	
	public void mas() {
		this.calc.estado = new Error(this.calc);
	}
	public void menos(){
		this.calc.estado = new Error(this.calc);
	}
	public void por(){
		this.calc.estado = new Error(this.calc);
	}
	public void dividido(){
		this.calc.estado = new Error(this.calc);
	}
	public String getResultado(){
		this.calc.estado = new Error(this.calc);
		return "Error.";
	}

}
