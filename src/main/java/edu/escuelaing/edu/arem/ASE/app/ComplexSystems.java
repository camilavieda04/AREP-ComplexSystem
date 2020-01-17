package edu.escuelaing.edu.arem.ASE.app;
//import edu.escuelaing.edu.arem.ASE.app.LinkedList;*;
import java.util.*;

public class ComplexSystems {

	public LinkedList<Double> lista = new LinkedList<Double>();
	
	/**
	 * Constructor
	 */
	
	public ComplexSystems() {
		lista.add(186.0);
		lista.add(699.0);
		lista.add(132.0);
		lista.add(272.0);
		lista.add(291.0);
		lista.add(331.0);
		lista.add(199.0);
		lista.add(1890.0);
		lista.add(788.0);
		lista.add(1601.0);
		
	}
	
	
	
	/**
	 * Metodo que retorna la sumatoria de los elementos de una LinkedList
	 * @return cont
	 */
	public  double sumatoria() {
		double cont = 0;
		for (int i = 0; i<lista.size();i++) {
			cont=cont+lista.get(i);
			
		}
		return cont;
	}
	
	/**
	 * Metodo que retorna la media de una LinkedList
	 * @return m 
	 */
	
	public double media() {
		double m = 0;
		m = sumatoria()/lista.size();
		return m;
		
	}
	
	/**
	 * Metodo que retorna la sumatoria de cada uno de los elementos de la LinkedList con el media que se calculo anteriormente
	 * @return cont
	 */
	public double sumatoria2() {
		double cont = 0;
		for (int i=0;i<lista.size();i++) {
			cont+=Math.pow(lista.get(i)-media(),2);
			
		}
	
		
		return cont;
	}
	/**
	 * Metodo que retorna la desviacion estandar de los elementos de una LinkedList
	 * @return r
	 */
	
	public  double DesviacionEstandar() {
		double r,d = 0;
		int lon = lista.size()-1;
		d = sumatoria2()/lon;
		r = Math.sqrt(d);
		return r;
		
	}
	
	
}
