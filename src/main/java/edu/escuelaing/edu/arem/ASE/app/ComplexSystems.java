package edu.escuelaing.edu.arem.ASE.app;
//import edu.escuelaing.edu.arem.ASE.app.LinkedList;*;
import java.util.*;

public class ComplexSystems {
	
	public LinkedL lista;
	
	public ComplexSystems() {
		
		lista = new LinkedL();
		lista.insertNodo(186.0);
		lista.insertNodo(699.0);
		lista.insertNodo(132.0);
		lista.insertNodo(291.0);
		lista.insertNodo(272.0);
		lista.insertNodo(331.0);
		lista.insertNodo(199.0);
		lista.insertNodo(1890.0);
		lista.insertNodo(788.0);
		lista.insertNodo(1601.0);
		System.out.println(lista);
	}
	
	/*
	/**
	 * Metodo que retorna la sumatoria de los elementos de una LinkedList
	 * @return cont
	
	public  double sumatoria() {
		double cont = 0;
		for (int i = 0; i<lista.size();i++) {
			cont=cont+lista.get(i);
			
		}
		return cont;
	}
	*/
	
	/**
	 * Metodo que retorna la media de una LinkedList
	 * @param lista LinkedList donde se encuentran todos los nodos
	 * @return resp
	 */
	
	public Double media() {
		System.out.println(lista);
		Double cont = 0.0;
		Double m = 0.0;
		Nodo a = lista.getPrimero();
		while (a!=null) {
			m+=1;
			cont+=a.getDato();
			a=a.getNext();
		}
		Double resp = cont/m;
		System.out.println(resp);
		return resp;
		
	}
	
	/*
	/**
	 * Metodo que retorna la sumatoria de cada uno de los elementos de la LinkedList con el media que se calculo anteriormente
	 * @return cont
	 
	public double sumatoria2() {
		double cont = 0;
		for (int i=0;i<lista.size();i++) {
			cont+=Math.pow(lista.get(i)-media(),2);
			
		}
	
		
		return cont;
	}
	*/
	
	/**
	 * Metodo que retorna la desviacion estandar de los elementos de una LinkedList
	 * @return r
	 */
	
	public  Double DesviacionEstandar() {
		Double m=media();
		Double cont =0.0;
		Double datos = -1.0;
		Nodo a = lista.getPrimero();
		while (a!=null) {
			datos+=1;
			cont+=(a.getDato()-m)*(a.getDato()-m);
			a=a.getNext();
		}
		return Math.sqrt(cont/datos);
		
	}
	
	public void insertandoNodo(Double datos) {
		lista.insertNodo(datos);
	}
	
	
	
	
	
	
	
}
