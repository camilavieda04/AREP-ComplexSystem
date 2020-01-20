package edu.escuelaing.edu.arem.ASE.app;
import static org.junit.Assert.*;
import org.junit.Test;



public class ComplexSystemTest {
	
	//ComplexSystems c = new ComplexSystems();
	
	 @Test
	 public void test() {
		 
	 }
	 
	 @Test
	 /*
	  * Calcular la media de los datos de la Linked List
	 */

	 public void mediaLinkedList() {
	 	 ComplexSystems c = new ComplexSystems();
		 c.insertandoNodo(186.0);
		 c.insertandoNodo(699.0);
		 c.insertandoNodo(132.0);
		 c.insertandoNodo(272.0);
		 c.insertandoNodo(291.0);
		 c.insertandoNodo(331.0);
		 c.insertandoNodo(199.0);
		 c.insertandoNodo(1890.0);
		 c.insertandoNodo(788.0);
		 c.insertandoNodo(1601.0);
		 Double resp = 638.9;
		 Double respuesta = c.media();
	 	 System.out.println(resp);
		 System.out.println(respuesta);
		 assertTrue (resp == respuesta);
	 }
	 
	 @Test
	 public void desviacionLinkedList() {
		 ComplexSystems c = new ComplexSystems();
		 c.insertandoNodo(186.0);
		 c.insertandoNodo(699.0);
		 c.insertandoNodo(132.0);
		 c.insertandoNodo(272.0);
		 c.insertandoNodo(291.0);
		 c.insertandoNodo(331.0);
		 c.insertandoNodo(199.0);
		 c.insertandoNodo(1890.0);
		 c.insertandoNodo(788.0);
		 c.insertandoNodo(1601.0); 
		 Double resp = 625.633980677023;
		 Double respuesta = c.DesviacionEstandar();
		 assertTrue(resp==respuesta);
	 }

	 
	 

}
