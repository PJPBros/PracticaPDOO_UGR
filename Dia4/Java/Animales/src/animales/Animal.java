package animales;

public abstract class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        setEdad(edad);
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre de un animal no puede estar vacio");
        }

        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {

        if (edad < 0) {
            throw new IllegalArgumentException("La edad de un animal no puede ser negativa");
        }

        this.edad = edad;
    }

    public abstract String hacerRuido();

}
