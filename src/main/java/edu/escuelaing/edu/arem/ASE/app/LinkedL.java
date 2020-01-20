package edu.escuelaing.edu.arem.ASE.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedL implements List  {
	
	Nodo n;

	public LinkedL() {
		n = null;
	}
	
	/**
	 * Metodo que inserta un nodo en la LinkedList
	 * @param datos valor del elemento que se insertara
	 * @return
	 */
	public void insertNodo(Double datos) {
		Nodo cont;
		if (n == null) {
			n = new Nodo(null,datos);
		}
		else {
			cont = n;
			while (n.next != null) {
				cont = cont.getNext();
			}
			Nodo x = new Nodo(null,datos);
			n.setNext(x);
		}
	}
	
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Metodo que retorna el nodo que se encuentra en la primera posicion de la LinkedList
	 * @return
	 */
	public Nodo getPrimero() {
		return n;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Metodo que elimina un elemento de la linked list
	 * @param datos valor del elemento que se eliminara de la Linked List
	 */
	
	public void eliminarNodo(Double datos) {
		boolean d = false;
		if(n!=null) {
			if(n.getDato()==datos) {
				n=n.getNext();
				d = true;
			}
			
			else {
				Nodo a = n.getNext();
				Nodo b = n;
				while (a!=null) {
					if (a.getDato()==datos) {
						a.setNext(a.getNext());
						d = true;
						break;
					}
					a = a.getNext();
					b = b.getNext();
				}
			}
		}
		
		if (d==true) {
			System.out.println("Nodo eliminado");
		}
		else {
			System.out.println("No se encontro el nodo");
		}
	}
	

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String [] args) {
		LinkedL lista = new LinkedL();
		Nodo n = null;
		//n = lista.insertNodo(n,3);
		//n = lista.insertNodo(n, 5);
		
	}

	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
