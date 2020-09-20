
package PatronComposite;
import PatronComposite.Circulo;
import PatronComposite.Dibujando;
import PatronComposite.Figura;
import PatronComposite.Triangulo;

public class PruebaComposite {
public static void main(String[] args){
    Figura tri = new Triangulo();
    Figura tri1 = new Triangulo();
    Figura cir = new Circulo();
    Dibujando dibujando = new Dibujando();
    dibujando.agregar(tri1);
    dibujando.agregar(tri1);
    dibujando.agregar(cir);
    dibujando.dibuja("Rojo");
    dibujando.borrar();
    dibujando.agregar(tri);
    dibujando.agregar(cir);
    dibujando.dibuja("Verde");
}
}