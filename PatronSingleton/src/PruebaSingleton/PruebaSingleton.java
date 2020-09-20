package PruebaSingleton;

public class PruebaSingleton {

    public static void main(String[] args) {
        logger Logger_1 = logger.getInstance();
        logger Logger_2 = logger.getInstance();
        Logger_1.setValue("Prueba 2");
        System.out.println(Logger_2.getValue());
    }

}
