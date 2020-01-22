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
		 //System.out.println(c);
		 Double resp = 638.9;
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
		Double respuesta = c.DesviacionEstandar(638.9);
		assertEquals(respuesta,resp);
	}

}
