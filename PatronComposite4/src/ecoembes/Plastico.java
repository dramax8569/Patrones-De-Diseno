package ecoembes;

public class Plastico implements Reciclable {
		private float costo;
			
		public Plastico (float costo){
			this.costo = costo;
		}
			
		@Override
		public float obtenerCosto(){
			return costo;
		}
		@Override
		public void agregarReciclable(Reciclable u){}
}
