package ecoembes;

import java.util.ArrayList;
import java.util.List;

public class EntregaComposite implements Reciclable {
	
	private List<Reciclable> Reciclables = new ArrayList<Reciclable>();
	
	@Override
	public float obtenerCosto(){
		float costo= 0;
		for (int i=0; i < this.Reciclables.size();i++){
			costo = costo + this.Reciclables.get(i).obtenerCosto();
		}
		return costo;
		
	}
	@Override	
	public void agregarReciclable(Reciclable r){
		this.Reciclables.add(r);
	}
	

}
