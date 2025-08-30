package animales;

public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String hacerRuido() {
        return String.format("Soy %s, tengo %d años. Guau!", nombre, edad);
    }

}
