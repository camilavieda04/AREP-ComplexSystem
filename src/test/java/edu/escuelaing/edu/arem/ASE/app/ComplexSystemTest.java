package edu.escuelaing.edu.arem.ASE.app;
import static org.junit.Assert.*;
import org.junit.Test;

public class ComplexSystemTest {

	 @Test
	 public void test() {
	 }
	 
	 @Test
	 /*
	  * Calcular la media de los datos de la Linked List
	 */
	 public void mediaLinkedList() {
	 	 ComplexSystems c = new ComplexSystems();
	 	 LinkedL lis = new LinkedL();
	 	 c.insertandoNodo(186.0);
	 	 c.insertandoNodo(699.0);
	 	 c.insertandoNodo( 132.0);
		 c.insertandoNodo(272.0);
		 c.insertandoNodo(291.0);
		 c.insertandoNodo(331.0);
		 c.insertandoNodo(199.0);
		 c.insertandoNodo(1890.0);
		 c.insertandoNodo(788.0);
		 c.insertandoNodo(1601.0);
		 Double resp = 638.9;
		 Double respuesta = c.retornaMedia();
		 assertEquals(respuesta,resp);

	 }
	 
	 @Test
	 public void mediaLinkedList2() {
	 	 ComplexSystems c = new ComplexSystems();
	 	 LinkedL lis = new LinkedL();
	 	 c.insertandoNodo(160.0);
	 	 c.insertandoNodo(591.0);
	 	 c.insertandoNodo(114.0);
		 c.insertandoNodo(229.0);
		 c.insertandoNodo(230.0);
		 c.insertandoNodo(270.0);
		 c.insertandoNodo(128.0);
		 c.insertandoNodo(1657.0);
		 c.insertandoNodo(624.0);
		 c.insertandoNodo(1503.0);
		 Double resp = 550.6;
		 Double respuesta = c.retornaMedia();
		 assertEquals(respuesta,resp);

	 }

	@Test
	/*
	 * Calcular la desviacion estandar de los datos de la Linked List
	 */
	public void desviacionEstandarLinkedList() {
		ComplexSystems c = new ComplexSystems();
		LinkedL lis = new LinkedL();
		c.insertandoNodo(186.0);
		c.insertandoNodo(699.0);
		c.insertandoNodo( 132.0);
		c.insertandoNodo(272.0);
		c.insertandoNodo(291.0);
		c.insertandoNodo(331.0);
		c.insertandoNodo(199.0);
		c.insertandoNodo(1890.0);
		c.insertandoNodo(788.0);
		c.insertandoNodo(1601.0);
		Double resp = 625.6339806770231;
		Double respuesta = c.desviacionEstandar(638.9);
		assertEquals(respuesta,resp);
	}
	
	@Test
	public void desviacionEstandarLinkedList2() {
		ComplexSystems c = new ComplexSystems();
		LinkedL lis = new LinkedL();
		c.insertandoNodo(160.0);
		c.insertandoNodo(591.0);
		c.insertandoNodo(114.0);
		c.insertandoNodo(229.0);
		c.insertandoNodo(230.0);
		c.insertandoNodo(270.0);
		c.insertandoNodo(128.0);
		c.insertandoNodo(1657.0);
		c.insertandoNodo(624.0);
		c.insertandoNodo(1503.0);
		Double resp = 572.026844746915;
		Double respuesta = c.desviacionEstandar(550.6);
		System.out.println(respuesta);
		assertEquals(respuesta,resp);
	}

	
	@Test
	/*
	 * Insertar un nodo en la Linked List
	 */
	public void deberiaInsertar() {
		LinkedL lis = new LinkedL();
		lis.insertNodo(186.0);
		lis.insertNodo(699.0);
		lis.insertNodo(132.0);
		lis.insertNodo(272.0);
		lis.insertNodo(291.0);
		lis.insertNodo(331.0);
		lis.insertNodo(199.0);
		lis.insertNodo(1890.0);
		lis.insertNodo(788.0);
		lis.insertNodo(1601.0);
		assertTrue(lis.getLen()==10);
	}
	
	@Test
	/*
	 * Insertar un nodo en la Linked List
	 */
	public void deberiaEliminar() {
		LinkedL lis = new LinkedL();
		lis.insertNodo(186.0);
		lis.insertNodo(699.0);
		lis.insertNodo(132.0);
		lis.insertNodo(272.0);
		lis.deleteNodo(186.0);
		lis.deleteNodo(699.0);
		lis.deleteNodo(132.0);
		lis.deleteNodo(272.0);
		assertTrue(lis.getLen()==0);
	}
	
	
}
