public class Rectangle extends Shape {
    private double base;
    private double height;

    public Rectangle(String color, double base, double height) {
        super(color);
        setBase(base);
        setHeight(height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("La base de un rectangulo debe ser mayor a cero");
        }

        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("La altura de un rectangulo debe ser mayor a cero");
        }

        this.height = height;
    }

    @Override
    public double area() {
        return base * height;
    }

    @Override
    public double perimetro() {
        return (base * 2) + (height * 2);
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("Rectangulo de base %.2f y altura %.2f -> Area: %.2f Perimetro: %.2f", base,
                        height, area(), perimetro());
    }

}
