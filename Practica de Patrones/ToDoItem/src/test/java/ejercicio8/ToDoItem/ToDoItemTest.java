package ejercicio8.ToDoItem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	public ToDoItem item;

	
	@BeforeEach
	public void setUp() {
		this.item = new ToDoItem ("Hacer el punto 8 de patrones");
	}
	
	@Test
	public void testStart() {
		this.item.start();
		Assertions.assertTrue(this.item.estado instanceof InProgress);
		//Tendria que probar que sea al mismo tiempo pero es imposible
		this.item.start();
		Assertions.assertTrue(this.item.estado instanceof InProgress); //No cambia, no se si tengo que probar por cada uno
	}
	
	@Test
	public void testTogglePause() {
		Assertions.assertThrows(RuntimeException.class,
			    () -> this.item.togglePause());
		this.item.start();
		this.item.togglePause();
		Assertions.assertTrue(this.item.estado instanceof Paused);
		this.item.togglePause();
		Assertions.assertTrue(this.item.estado instanceof InProgress);
		this.item.finish();
		Assertions.assertThrows(RuntimeException.class,
			    () -> this.item.togglePause());
	}
	
	@Test
	public void testFinishSinPausa() {
		Assertions.assertTrue(this.item.estado instanceof Pending);
		this.item.start();
		this.item.finish();
		Assertions.assertTrue(this.item.estado instanceof Finished);
	}
	
	@Test 
	public void testFinishConPausa () {
		this.item.start();
		this.item.togglePause();
		this.item.finish();
		Assertions.assertTrue(this.item.estado instanceof Finished);
	}
	
	@Test
	public void testWorkedTime () {
		Assertions.assertThrows(RuntimeException.class,
			    () -> this.item.workedTime());
		//es dificil de testear sin valores precargados pero seria que si esta Inprogress/Paused genera el tiempo entre inicio hasta ahora y si es Finished devuelve el tiempo completo
	}

}
