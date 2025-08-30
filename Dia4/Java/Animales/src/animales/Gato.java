package animales;

public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String hacerRuido() {
        return String.format("Soy %s, tengo %d años. Miau!", nombre, edad);
    }
}
