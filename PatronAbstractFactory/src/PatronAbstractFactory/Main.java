
package PatronAbstractFactory;

public class Main
{
    public static void main(String[] args)
    {
        
        Cliente cliente = new Cliente( new ComponentesAzules() );

        System.out.println("----------------------------");

        cliente = new Cliente( new ComponentesRojos() );
    }
}