package animales;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Animal> animales = new ArrayList<>();

        Perro perro = new Perro("Motas", 2);
        Gato gato = new Gato("Bigotes", 6);
        Pajaro pajaro = new Pajaro("Lorote", 5);

        animales.add(perro);
        animales.add(gato);
        animales.add(pajaro);

        for (Animal animal : animales) {
            System.out.println(animal.hacerRuido());
        }

    }
}
