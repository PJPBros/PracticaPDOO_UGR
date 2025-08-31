public abstract class Shape {
    private String color;

    public Shape(String color) {
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("El color de una figura no puede estar vacio");
        }

        this.color = color;
    }

    public abstract double area();

    public abstract double perimetro();

    @Override
    public String toString() {
        return "Figura de color " + color + ": ";
    }

}
