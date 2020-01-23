package edu.escuelaing.edu.arem.ASE.app;


import java.util.*;

public class ComplexSystems {
	
	public LinkedL lista;
	public Double media, desviEst;
	
	public ComplexSystems() {
		
		lista = new LinkedL();
	}

	/**
	 * Metodo que retorna la media de una LinkedList
	 * @return resp
	 */
	
	public Double retornaMedia() {
		Double cont = 0.0;
		for (int i = 0; i<lista.getLen();i++) {
			cont+=lista.getActual().getDato();
			lista.setNodoActual(lista.getActual().getNext());
			//System.out.println(cont);
		}
		Double resp = cont/lista.getLen();
		//System.out.println("RESPUESTAAAA"+resp);
		return resp;
		
	}

	
	/**
	 * Metodo que retorna la desviacion estandar de los elementos de una LinkedList
	 * @return r
	 */
	
	public  Double DesviacionEstandar(Double resp) {
		Double cont = 0.0;
		for (int i=0; i<lista.getLen();i++){
			Double resp1 = lista.getActual().getDato()-resp;
			resp1=resp1*resp1;
			cont+=resp1;
			lista.setNodoActual(lista.getActual().getNext());
		}
		Double desviacion = Math.sqrt(cont/(lista.getLen()-1));
		return desviacion;
	}
	
	public void insertandoNodo(Double datos) {

		lista.insertNodo(datos);
	}

	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null || getClass()!=o.getClass()) {
			return false;
		}
		ComplexSystems that = (ComplexSystems) o;
		return Double.compare(that.media,media)==0 &&
				Double.compare(that.desviEst,desviEst)==0;


	}

	
	
	
	
	
}
