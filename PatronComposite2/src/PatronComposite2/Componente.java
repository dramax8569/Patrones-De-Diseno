/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronComposite2;

import java.util.*;

public abstract class Componente
{
	protected String nombre;
	public Componente (String nombre)
	{
		this.nombre = nombre;
	}
	abstract public void agregar(Componente c);
	abstract public void eliminar(Componente c);
	abstract public void mostrar(int profundidad);
}
