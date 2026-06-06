package Parcial.Documento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentoTest {
	Documento doc;
	Seccion seccionRaiz;
	Seccion seccion2;
	LIstaOrdenada lista;

	@BeforeEach
	public void setUp() {
		this.seccion2 = new Seccion("Arquitectura de Servicios");
		this.seccion2.addChild(new Parrafo("Arranca el semestre que viene"));
		this.lista = new LIstaOrdenada();
		lista.agregarItem("Patrones de diseño.");
		lista.agregarItem("Refactoring de codigo.");
		this.seccionRaiz = new Seccion ("Orientacion a objetos");
		this.seccionRaiz.addChild(new Parrafo("Temas de la materia: "));
		this.seccionRaiz.addChild(this.lista);
		this.seccionRaiz.addChild(this.seccion2);
		this.doc = new Documento ("Plan de estudio", "Pedro", this.seccionRaiz);
	}
	
	@Test 
	public void testImprimir () {
		Assertions.assertEquals("todo el choclo", this.doc.toString());
	}




}
