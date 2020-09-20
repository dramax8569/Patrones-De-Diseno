package Elementos;

public class Carne implements AdicionalesDecorator{

	Combo combo;
	
	public Carne(Combo combo)
	{
		this.combo=combo;	
	}
	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" , Porcion de Carne";
	}

	@Override
	public int valor() {
		return 5000+combo.valor();
	}
}
