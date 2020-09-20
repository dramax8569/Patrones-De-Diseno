/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronBridge;

/**
 *
 * @author mdelgado
 */
public class Envasar implements IElaborar
{
    public Envasar() {
    }

    // --------------------------

    @Override
    public void procesar()
    {
        // Operaciones necesarias
        // ...

        System.out.println("\tAlimento envasado");
    }
}