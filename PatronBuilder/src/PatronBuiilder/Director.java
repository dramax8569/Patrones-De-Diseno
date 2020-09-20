/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronBuiilder;

public class Director
{

    public Director() {
    }

    // --------------------------

    public void construir( BuilderCarro builder )
    {
        builder.crearNuevoCarro();

        builder.construirMotor();
        builder.construirCarroceria();
        builder.construirElevavidrios();
        builder.construirAireAcond();
    }
}