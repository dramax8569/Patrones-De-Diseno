package Elementos;


public class ComboBasico implements Combo{
        String descripcion = "";
	public ComboBasico() {
		descripcion="Porcion de Papas Fritas, " +
			"salsa, queso, hamburguesa sencilla, gaseosa";
	}
	
	@Override
	public int valor() {
		return 10000;
	}

    @Override
    public String getDescripcion() {
		return descripcion;
    }
}
