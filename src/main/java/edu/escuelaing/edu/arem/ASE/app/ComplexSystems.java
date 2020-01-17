package edu.escuelaing.edu.arem.ASE.app;
import java.util.*;

public class ComplexSystems {

	public LinkedList<Double> lista = new LinkedList<Double>();
	
	
	/**
	 * Metodo que retorna la sumatoria de los elementos de una LinkedList
	 * @return cont
	 */
	private double sumatoria() {
		double cont = 0;
		for (int i =0; i<lista.size();i++) {
			cont+=lista.get(i);
		}
		return cont;
	}
	
	/**
	 * Metodo que retorna la media de una LinkedList
	 * @return m 
	 */
	
	private double media() {
		double m = 0;
		m = sumatoria()/lista.size();
		return m;
		
	}
	
	/**
	 * Metodo que retorna la sumatoria de cada uno de los elementos de la LinkedList con el media que se calculo anteriormente
	 * @return cont
	 */
	private double sumatoria2() {
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
	
	private double DesviacionEstandar() {
		double r = 0;
		double d = 0;
		d = sumatoria2()/lista.size()-1;
		r = Math.sqrt(d);
		return r;
		
	}
	
	
}
