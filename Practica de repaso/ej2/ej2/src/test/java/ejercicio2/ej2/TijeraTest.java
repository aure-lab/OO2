package ejercicio2.ej2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TijeraTest {
	private Tijera t;
	
	@BeforeEach
	public void setUp () {
		this.t = new Tijera();
	}
	
	@Test
	public void testCombatir () {
		Assertions.assertEquals(this.t.combatir(t), "Empate");
		
		Piedra p = new Piedra();
		Assertions.assertEquals("Piedra", this.t.combatir(p));
		
		Papel pa = new Papel();
		Assertions.assertEquals("Tijera", this.t.combatir(pa));
	}
	
	//TENGO QUE HACER ESTO CON TODOS??

}
