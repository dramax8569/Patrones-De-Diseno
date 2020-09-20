package Elementos;

public class Papas implements AdicionalesDecorator {

    Combo combo;

    public Papas(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String getDescripcion() {
        return combo.getDescripcion() + " , Porcion de Papas";
    }

    @Override
    public int valor() {
        return 3500 + combo.valor();
    }

}
