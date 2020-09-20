/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronBuiilder;

public class ConstructorCarroMedio extends BuilderCarro
{
    public ConstructorCarroMedio() {
    }

    // ------------------------------

    @Override
    public void construirMotor() {
        this.carro.setMotor( "Motor de potencia media" );
    }

    // ------------------------------

    @Override
    public void construirCarroceria() {
        this.carro.setCarroceria( "Carrocería de protección media" );
    }

    // ------------------------------

    @Override
    public void construirAireAcond() {
        this.carro.setAireAcond( false );
    }

    // ------------------------------

    @Override
    public void construirElevavidrios() {
        this.carro.setElevavidriosElec( true );
    }
}