
package PatronBridge1;
 
abstract class Vehiculo { 
	protected Taller taller1; 
	protected Taller taller2; 

	protected Vehiculo(Taller taller1, Taller taller2) 
	{ 
		this.taller1 = taller1; 
		this.taller2 = taller2; 
	} 

	abstract public void manufacture(); 
} 

// Refine abstraction 1 in bridge pattern 
class Carro extends Vehiculo { 
	public Carro(Taller taller1, Taller taller2) 
	{ 
		super(taller1, taller2); 
	} 

	@Override
	public void manufacture() 
	{ 
		System.out.print("Carro "); 
		taller1.tarea(); 
		taller2.tarea(); 
	} 
} 

// Refine abstraction 2 in bridge pattern 
class Bicicleta extends Vehiculo { 
	public Bicicleta(Taller taller1, Taller taller2) 
	{ 
		super(taller1, taller2); 
	} 

	@Override
	public void manufacture() 
	{ 
		System.out.print("Bicicleta "); 
		taller1.tarea(); 
		taller2.tarea(); 
	} 
} 

// Implementor for bridge pattern 
interface Taller 
{ 
	abstract public void tarea(); 
} 

// Concrete implementation 1 for bridge pattern 
class Producir implements Taller { 
	@Override
	public void tarea() 
	{ 
		System.out.print("Producido"); 
	} 
} 

// Concrete implementation 2 for bridge pattern 
class Ensamble implements Taller { 
	@Override
	public void tarea() 
	{ 
		System.out.print(" Y"); 
		System.out.println(" Ensamblado."); 
	} 
} 

// Demonstration of bridge design pattern 
class BridgePattern { 
	public static void main(String[] args) 
	{ 
		Vehiculo vehiculo1 = new Carro(new Producir(), new Ensamble()); 
		vehiculo1.manufacture(); 
		Vehiculo vehiculo2 = new Bicicleta(new Producir(), new Ensamble()); 
		vehiculo2.manufacture(); 
	} 
} 
