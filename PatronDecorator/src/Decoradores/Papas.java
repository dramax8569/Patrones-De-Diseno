package decoradores;
import componentes.Combo;

public class Papas extends AdicionalesDecorator{

	Combo combo;
	
	public Papas(Combo combo)
	{
		this.combo=combo;	
	}
	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" , Porcion de Papas";
	}

	@Override
	public int valor() {
		return 3500+combo.valor();
	}

}