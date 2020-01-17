package edu.escuelaing.edu.arem.ASE.app;

public class Nodo {
	
	public int dato;
	public Nodo next;
	public Nodo prior;
	
	/*
	 * Constructor de la clase Nodo
	 */
	
	public Nodo(int dato) {
		this.dato=dato;
	}
	
	/**
	 * Metodo que retorna dato del Nodo 
	 * @return dato
	 */
	
	public int getDato() {
		return dato;
	}
	
	/**
	 * Metodo que cambia el dato del Nodo 
	 * @param dato
	 */
	
	public void setDato(int dato) {
		this.dato=dato;
	}
	
	/**
	 * Metodo que retorna el nodo siguiente 
	 * @return next
	 */
	public Nodo getNext() {
		return next;
	}
	
	
	/**
	 * Metodo que cambia el nodo siguiente
	 * @param next
	 */
	public void setNext(Nodo next) {
		this.next=next;
	}
	
	
	/**
	 * Metodo que retorna el nodo anterior
	 * @return prior
	 */
	public Nodo getPrior() {
		return prior;
	}
	
	/**
	 * Metodo que cambia el nodo anterior
	 * @param prior
	 */
	public void setPrior(Nodo prior) {
		this.prior=prior;
	}
	
	
	
	
	

}
