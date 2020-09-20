/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronBuiilder;

public class ConstructorCarroFull extends BuilderCarro
{
    public ConstructorCarroFull() {
    }

    // ------------------------------

    @Override
    public void construirMotor() {
        this.carro.setMotor( "Motor de potencia alta" );
    }

    // ------------------------------

    @Override
    public void construirCarroceria() {
        this.carro.setCarroceria( "Carrocería de alta protección" );
    }

    // ------------------------------

    @Override
    public void construirAireAcond() {
        this.carro.setAireAcond( true );
    }

    // ------------------------------

    @Override
    public void construirElevavidrios() {
        this.carro.setElevavidriosElec( true);
    }
}