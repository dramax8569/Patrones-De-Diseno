package PatronFactory;

public class ArchivoVideo implements IArchivo
{
    public ArchivoVideo() {
    }

    @Override
    public void reproducir() {
        System.out.println("Leyendo archivo de vídeo");
    }
}