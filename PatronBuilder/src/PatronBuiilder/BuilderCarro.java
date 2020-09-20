/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronBuiilder;

public abstract class BuilderCarro
{
    protected Carro carro;

    // ------------------------------

    public Carro getCarro() {
        return this.carro;
    }

    // ------------------------------

    public void crearNuevoCarro() {
        this.carro = new Carro();
    }

    // ------------------------------------

    // Métodos que deberán ser construídos por las clases que hereden de ésta
    public abstract void construirMotor();
    public abstract void construirCarroceria();
    public abstract void construirAireAcond();
    public abstract void construirElevavidrios();
}