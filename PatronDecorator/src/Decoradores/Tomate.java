package decoradores;
import componentes.Combo;

public class Tomate extends AdicionalesDecorator{

	Combo combo;
	
	public Tomate(Combo combo)
	{
		this.combo=combo;
	}

	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" , Porcion de Tomate y Lechuga";
	}

	@Override
	public int valor() {
		return 1000+combo.valor();
	}

}
