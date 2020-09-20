package Elementos;

public class Queso implements AdicionalesDecorator{

	Combo combo;
	
	public Queso(Combo combo)
	{
		this.combo=combo;	
	}
	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" , Porcion de Queso";
	}

	@Override
	public int valor() {
		return 3000+combo.valor();
	}

}