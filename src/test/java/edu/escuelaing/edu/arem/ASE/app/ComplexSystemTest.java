package edu.escuelaing.edu.arem.ASE.app;
import static org.junit.Assert.*;
import org.junit.Test;


public class ComplexSystemTest {
	 @Test
	 public void test() {
		 
	 }
	 
	 @Test
	 public void mediaLinkedList() {
		 ComplexSystems a = new ComplexSystems();
		 assertTrue(a.media()==638.9);
		
	 }
	 
	 @Test
	 public void desviacionLinkedList() {
		 ComplexSystems a = new ComplexSystems();
		 assertTrue(a.DesviacionEstandar()==625.6339806770231);
	 }
	 
	 
	 

}
