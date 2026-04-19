package ejercicio10.Calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	private Calculadora calc;
	
	
	@BeforeEach
	public void setUp () {
		this.calc = new Calculadora();
	}
	
	@Test
	public void testGetResultado() {
		Assertions.assertEquals("0.0", this.calc.getResultado());
		this.calc.mas();
		this.calc.setValor(5);
		Assertions.assertEquals("5.0", this.calc.getResultado());
	}
	
	@Test
	public void testMas() {
		this.calc.mas();
		this.calc.setValor(5);
		Assertions.assertEquals("5.0", this.calc.getResultado());
	}
	
	@Test
	public void testMenos(){
		this.calc.menos();
		this.calc.setValor(5);
		Assertions.assertEquals("-5.0", this.calc.getResultado());
	}
	
	@Test 
	public void testDividido() {
		this.calc.setValor(5);
		this.calc.dividido();
		this.calc.setValor(5);
		Assertions.assertEquals("1.0", this.calc.getResultado());
		this.calc.dividido();
		this.calc.setValor(0);
		Assertions.assertEquals("Error.", this.calc.getResultado());
		
	}
	
	@Test 
	public void testPor() {
		this.calc.por();
		this.calc.setValor(5);
		Assertions.assertEquals("0.0", this.calc.getResultado());
	}
	
	@Test 
	public void testBorrar() {
		this.calc.mas();
		this.calc.setValor(5);
		this.calc.borrar();
		Assertions.assertEquals("0.0", this.calc.getResultado());
	}
	
	@Test
	public void testError() {
		this.calc.mas();
		this.calc.mas(); //o cualquier operacion, tengo que probar una por una???
		Assertions.assertEquals("Error.", this.calc.getResultado());
		this.calc.dividido();
		this.calc.setValor(5);
		Assertions.assertEquals("Error.", this.calc.getResultado()); //El comportamiento no caombia
		this.calc.borrar();
		Assertions.assertEquals("0.0", this.calc.getResultado()); //Se reinicia
	}
	
	
	
	
	
	
	
	
	
	
	

}
