package PatronComposite;

import java.util.ArrayList;
import java.util.List;

public class Dibujando implements Figura{

	private List<Figura> figuras = new ArrayList<Figura>();
	
	@Override
	public void dibuja(String RellenoColor) {
		for(Figura sh : figuras)
		{
			sh.dibuja(RellenoColor);
		}
	}
	
	public void agregar(Figura s){
		this.figuras.add(s);
	}
	
	
	public void remover(Figura s){
		this.figuras.remove(s);
	}
	
	
	public void borrar(){
		System.out.println("Borrando todas las figuras de Dibujando");
		this.figuras.clear();
	}
}