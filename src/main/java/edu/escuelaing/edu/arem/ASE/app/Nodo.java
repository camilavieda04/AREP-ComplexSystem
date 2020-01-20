package edu.escuelaing.edu.arem.ASE.app;

public class Nodo {
	
	public Double dato;
	public Nodo next;
	
	/*
	 * Constructor de la clase Nodo
	 */
	
	public Nodo(Nodo x,Double dato) {
		this.dato=dato;
		this.next = next;
	}
	
	/**
	 * Metodo que retorna dato del Nodo 
	 * @return dato
	 */
	
	public Double getDato() {
		return dato;
	}
	
	/**
	 * Metodo que cambia el dato del Nodo 
	 * @param dato
	 */
	
	public void setDato(Double dato) {
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
	

}
