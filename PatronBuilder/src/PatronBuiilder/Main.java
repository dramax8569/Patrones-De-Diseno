package PatronBuiilder;

public class Main
{
    public static void main(String[] args)
    {
        // Crear el objeto Director
        Director objFabrica = new Director();

        // Crear los objetos ConcreteBuilder
        BuilderCarro base  = new ConstructorCarroBase();
        BuilderCarro medio = new ConstructorCarroMedio();
        BuilderCarro full  = new ConstructorCarroFull();

        // Construir un carro con equipamiento base
        objFabrica.construir( base );
        Carro carroBase = base.getCarro();

        // Construir un carro con equipamiento medio
        objFabrica.construir( medio );
        Carro carroMedio = medio.getCarro();

        // Construir un carro con equipamiento full
        objFabrica.construir( full );
        Carro carroFull = full.getCarro();

        // Mostrar la información de cada carro creado
        mostrarCaracteristicas( carroBase );
        mostrarCaracteristicas( carroMedio );
        mostrarCaracteristicas( carroFull );
    }

    // --------------------------------

    public static void mostrarCaracteristicas( Carro carro )
    {
        System.out.println( "Motor: " + carro.getMotor() );
        System.out.println( "Carrocería: " + carro.getCarroceria() );
        System.out.println( "Elevavidrios eléctrico: " + carro.getElevavidriosElec() );
        System.out.println( "Aire acondicionado: " + carro.getAireAcond() );

        System.out.println("===================================");
    }
}