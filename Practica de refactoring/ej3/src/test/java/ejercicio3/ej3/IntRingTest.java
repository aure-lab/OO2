package ejercicio3.ej3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntRingTest {
	private IntRing ring;
	private int [] vec;
	
	@BeforeEach()
	public void setUp() {
		this.vec = new int [2];
		this.vec[0]=1;
		this.vec[1]=2;
		this.ring = new IntRing(this.vec);
	}
	
	@Test 
	public void testNext() {
		Assertions.assertEquals(this.vec[0], this.ring.next());
		Assertions.assertEquals(this.vec[1], this.ring.next());
		Assertions.assertEquals(this.vec[0], this.ring.next());
	}

}
