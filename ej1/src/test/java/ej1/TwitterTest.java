package ej1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ej1.Twitter;
import ar.edu.unlp.info.oo1.ej1.Usuario;

public class TwitterTest {
	private Twitter x;
	
	@BeforeEach
	public void setUp() {
		this.x = new Twitter ();
	}
	
	@Test 
	public void testExisteUsuario() {
		this.x.crearUsuario("aa"); //existe
		Assertions.assertTrue(this.x.existeUsuario("aa"));
		
		Assertions.assertFalse(this.x.existeUsuario("00")); //no existe
		
	}
	
	@Test
	public void testCrearUsuario() {
		this.x.crearUsuario("oaa"); //se crea el primero y se añade
		Assertions.assertTrue(this.x.existeUsuario("oaa"));
		
		this.x.crearUsuario("oaa"); //no se añade porque ya existe
		Assertions.assertEquals(this.x.getCantidadDeUsuarios(), 1);
	}
	
	@Test
	public void testElimiarUsuario() {
		this.x.crearUsuario("aaaa");
		this.x.eliminarUsuario("aaaa");
		Assertions.assertFalse(this.x.existeUsuario("aaaa"));
		
		this.x.eliminarUsuario("aaaa"); //no existe
		//el assert seria que no explote el sistema pero no se como escribirlo
		
		
		
	}

}
