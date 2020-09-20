package PatronFactory;

public class ArchivoAudio implements IArchivo
{
    public ArchivoAudio() {
    }

    @Override
    public void reproducir() {
        System.out.println("Leyendo archivo de audio");
    }
}