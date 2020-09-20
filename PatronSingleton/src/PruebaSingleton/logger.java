package PruebaSingleton;

public class logger {

    private static logger Log;
    private String value;

    private logger() {
    }

    //Cuando se trabaje con hilos se puede estar creando otra instancia en un hilo
    //por esta razón se puede utilizar synchronized para evitar crear la otra instancia.
    //En este caso no se necesita porque cargaría mucho la aplicación
    //public static synchronized logger getInstance(){
    public static logger getInstance() {

        if (Log == null) {
            Log = new logger();
        }
        return Log;
    }

    public void Log(String msg) {
        System.out.println(msg);
    }

    public void setValue(String msg) {
        value = msg;
    }

    public String getValue() {
        return value;
    }
}
