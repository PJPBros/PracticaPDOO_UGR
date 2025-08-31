public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor a cero");
        }

        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("Circulo de radio: %.2f -> Area: %.2f Perimetro: %.2f", radius, area(), perimetro());
    }

}
