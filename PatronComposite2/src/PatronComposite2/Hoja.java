/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronComposite2;

class Hoja extends Componente
{
	public Hoja (String nombre)
	{
		super(nombre);
	}
	public void agregar(Componente c)
	{
		System.out.println("no se puede agregar la hoja");
	}
	public void eliminar(Componente c)
	{
		System.out.println("no se puede quitar la hoja");
	}
	public void mostrar(int depth)
	{
		System.out.println('-' + "" + nombre);
	}
}
