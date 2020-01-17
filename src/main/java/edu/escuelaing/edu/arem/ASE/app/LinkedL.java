package edu.escuelaing.edu.arem.ASE.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedL implements List  {
	
	int longitud;
	Nodo n;

	public LinkedL() {
		longitud = 0;
		n = null;
	}
	
	public Nodo insertNodo(Nodo n, int datos ) {
		Nodo cont;
		if (n == null) {
			n = new Nodo(datos);
			return n;
		}
		else {
			cont = n;
			while (n.next != null) {
				cont = cont.next;
			}
			cont.next = new Nodo(datos);
			return n;
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

	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
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

}
