
package PatronAbstractFactory;

public abstract class Boton
{
    private String texto;


    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


    public void dibujar()
    {
        System.out.println("Dibujando el botón...");
    }

    public abstract void configurar();
}