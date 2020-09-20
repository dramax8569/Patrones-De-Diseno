package Main;

import ecoembes.EntregaComposite;
import ecoembes.Plastico;
import ecoembes.Vidrio;

public class Cliente {

	private int numVidrios;
	private int numPlasticos;
	
	public Cliente(int vidrios, int plasticos){
		this.numVidrios = vidrios;
		this.numPlasticos = plasticos;
	}
	
	public static void main(String[] args) {
		float costeVidrio=12, costePlastico=8;
		Cliente c = new Cliente(5, 10);
		EntregaComposite ec = new EntregaComposite();
		
		for(int i=0;i<c.numVidrios;i++){
			ec.agregarReciclable(new Vidrio(costeVidrio));
		}
		
		for(int i=0;i<c.numPlasticos;i++){
			ec.agregarReciclable(new Plastico(costePlastico));
		}
		
		System.out.println("Valor a pagar por la entrega: " + ec.obtenerCosto());

	}

}
