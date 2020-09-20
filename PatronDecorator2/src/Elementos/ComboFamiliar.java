package Elementos;

public class ComboFamiliar implements Combo {

    String descripcion = "";

    public ComboFamiliar() {
        descripcion = "Doble Porcion de Papas Fritas, "
                + "salsa,doble queso, Hamburguesa "
                + "Familiar,doble tomate, gaseosa";
    }

    @Override
    public int valor() {
        return 30000;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

}
