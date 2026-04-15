package ejercicio3.ej3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CharRingTest {
	
	private CharRing ring;
	private char [] caracteres;
	
	@BeforeEach
	
	public void setUp () {
		this.ring = new CharRing("Ho");
		this.caracteres = "Ho".toCharArray();
	}
	
	@Test
	public void testNext () {
		
		Assertions.assertEquals(this.caracteres[0], this.ring.next()); //el primero
		Assertions.assertEquals(this.caracteres[1], this.ring.next());
		Assertions.assertEquals(this.caracteres[0], this.ring.next()); //que de la vuelta
	}

}
