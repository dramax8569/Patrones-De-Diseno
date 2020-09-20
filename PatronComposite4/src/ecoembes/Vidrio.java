package ecoembes;

public class Vidrio implements Reciclable {
		private float costo;
		
		public Vidrio (float costo){
			this.costo = costo;
		}
		
		@Override
		public float obtenerCosto(){
			return costo;
		}
		@Override
		public void agregarReciclable(Reciclable u){}		
}
