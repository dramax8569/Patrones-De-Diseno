package componentes;


public class ComboBasico extends Combo{

	public ComboBasico() {
		descripcion="Porcion de Papas Fritas, " +
			"salsa, queso, hamburguesa sencilla, gaseosa";
	}
	
	@Override
	public int valor() {
		return 10000;
	}
}
