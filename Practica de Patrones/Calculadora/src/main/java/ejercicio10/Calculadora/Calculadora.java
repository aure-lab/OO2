package ejercicio10.Calculadora;

public class Calculadora {
	protected double resultado;
	protected Estado estado;
	
	public Calculadora() {
		this.borrar();
	}
	
	public String getResultado() {
		return this.estado.getResultado();
	}
	
	public void borrar() {
		this.resultado = 0;
		this.estado = new Inicial(this);
	}
	
	public void setValor(double unValor) {
		this.estado.SetValor(unValor);;
	}
	
	public void mas() {
		this.estado.mas();
	}
	
	public void menos() {
		this.estado.menos();
	}
	
	public void por() {
		this.estado.por();
	}
	
	public void dividido() {
		this.estado.dividido();
	}
	
	
	

}
