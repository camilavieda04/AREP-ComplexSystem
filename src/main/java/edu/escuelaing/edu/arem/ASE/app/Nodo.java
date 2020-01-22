package edu.escuelaing.edu.arem.ASE.app;

public class Nodo {
	
	public Double dato;
	public Nodo next;
	
	/*
	 * Constructor de la clase Nodo
	 */
	
	public Nodo(Double dato) {
		this.dato=dato;
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


	/**
	 * Metodo que permite comparar dos Nodos
	 * @param n nodo que se quiere comparar
	 * @return equals una variable de tipo booleano que nos permite conocer si los Nodos son iguales o no
	 */
	public boolean equals(Nodo n) {
		boolean equals = false;
		if (n.getDato() == this.dato) {
			equals = true;
		}
		return equals;
	}

}
