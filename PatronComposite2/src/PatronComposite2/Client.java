/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronComposite2;

public class Client
{
	public static void main(String[] args)
	{
		Compuesto raiz = new Compuesto("root");
		raiz.agregar(new Hoja("hoja A"));
		raiz.agregar(new Hoja("hoja B"));
		Compuesto comp = new Compuesto("compuesto X");
		comp.agregar(new Hoja("hoja XA"));
		comp.agregar(new Hoja("hoja XB"));
		raiz.agregar(comp);
		raiz.agregar(new Hoja("hoja C"));
		Hoja l = new Hoja("hoja D");
		raiz.agregar(l);
		raiz.eliminar(l);
		raiz.mostrar(1);
	}
}