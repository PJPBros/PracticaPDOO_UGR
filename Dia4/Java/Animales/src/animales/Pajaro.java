package animales;

public class Pajaro extends Animal {

    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String hacerRuido() {
        return String.format("Soy %s, tengo %d años. Pio pio!", nombre, edad);
    }
}
