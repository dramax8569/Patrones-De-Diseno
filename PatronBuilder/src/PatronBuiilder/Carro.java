/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronBuiilder;

public class Carro
{
    private String motor = "";
    private String carroceria = "";
    private Boolean elevavidriosElec = false;
    private Boolean aireAcond = false;

    // -------------------------------------------

    public Carro() {
    }

    // -------------------------------------------

    public String getMotor() {
        return this.motor;
    }

    // -------------------------------------------

    public void setMotor(String motor) {
        this.motor = motor;
    }

    // -------------------------------------------

    public String getCarroceria() {
        return this.carroceria;
    }

    // -------------------------------------------

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    // -------------------------------------------

    public Boolean getElevavidriosElec() {
        return elevavidriosElec;
    }

    // -------------------------------------------

    public void setElevavidriosElec(Boolean elevavidriosElec) {
        this.elevavidriosElec = elevavidriosElec;
    }

    // -------------------------------------------

    public Boolean getAireAcond() {
        return aireAcond;
    }

    // -------------------------------------------

    public void setAireAcond(Boolean aireAcond) {
        this.aireAcond = aireAcond;
    }
}
