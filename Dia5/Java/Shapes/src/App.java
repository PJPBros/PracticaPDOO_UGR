import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Shape> shapes = new ArrayList<>();

        Rectangle rectangle = new Rectangle("Rojo", 2, 2);
        Circle circle = new Circle("Azul", 2);

        shapes.add(rectangle);
        shapes.add(circle);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

    }
}
