package ar.edu.unlp.info.oo2.biblioteca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	private Biblioteca unlp;
	
	@BeforeEach
	public void setUp() {
		this.unlp = new Biblioteca();
	}
	@Test
	public void testExportarSociosVoorheesExporter() {
		Assertions.assertEquals("[]", this.unlp.exportarSocios());
		this.unlp.agregarSocio(new Socio ("Arya Stark", "needle@stark.com", "5234-5"));
		this.unlp.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		String separator = System.lineSeparator();
		Assertions.assertEquals("[" + separator
                + "\t{" + separator
                + "\t\t\"nombre\": \"Arya Stark\"," + separator
                + "\t\t\"email\": \"needle@stark.com\"," + separator
                + "\t\t\"legajo\": \"5234-5\"" + separator
                + "\t}," + separator
                + "\t{" + separator
                + "\t\t\"nombre\": \"Tyron Lannister\"," + separator
                + "\t\t\"email\": \"tyron@thelannisters.com\"," + separator
                + "\t\t\"legajo\": \"2345-2\"" + separator
                + "\t}" + separator
                + "]", this.unlp.exportarSocios());
	}
	
	@Test 
	public void testExportarSociosJsonAdapter() {
		this.unlp.setExporter(new JsonAdapter());
		Assertions.assertEquals("[]", this.unlp.exportarSocios());
		this.unlp.agregarSocio(new Socio ("Arya Stark", "needle@stark.com", "5234-5"));
		Assertions.assertEquals("[{\"legajo\":\"5234-5\",\"nombre\":\"Arya Stark\",\"email\":\"needle@stark.com\"}]", this.unlp.exportarSocios());
		
	}
	
	@Test 
	public void testExportarSociosJacksonAdapter() {
		this.unlp.setExporter(new JacksonAdapter());
		Assertions.assertEquals("[]", this.unlp.exportarSocios());
		this.unlp.agregarSocio(new Socio ("Arya Stark", "needle@stark.com", "5234-5"));
		Assertions.assertEquals("[{\"nombre\":\"Arya Stark\",\"legajo\":\"5234-5\",\"email\":\"needle@stark.com\"}]", this.unlp.exportarSocios());
		
	}
}
