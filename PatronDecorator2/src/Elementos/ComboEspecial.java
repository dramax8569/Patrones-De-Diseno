package Elementos;

public class ComboEspecial implements Combo{
      String descripcion = "";
	public ComboEspecial()
	{
		descripcion="Doble Porcion de Papas Fritas,3 tipos " +
				"de salsa,doble queso, Hamburguesa Especial " +
				"Doble Carne, Doble tomate, gaseosa";
	}
	
	@Override
	public int valor() {
		return 20000;
	}

    @Override
    public String getDescripcion() {
		return descripcion;
    }
	
}
