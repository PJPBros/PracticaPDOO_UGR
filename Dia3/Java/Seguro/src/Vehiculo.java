public class Vehiculo {
    private static final int MAXSPEED = 200;
    private static final int MINSPEED = 0;

    private String matricula;
    private int velocidad;

    public Vehiculo(String matricula, int velocidad) {
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {

        if (matricula == null || matricula.isEmpty()) {
            throw new IllegalArgumentException("La matricula no puede estar vacia");
        }

        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {

        if (velocidad < 0) {
            throw new IllegalArgumentException("La velocidad no puede ser negativa");
        }

        this.velocidad = velocidad;
    }

    public void acelerar(int incremento) {

        velocidad += incremento;

        if (velocidad > MAXSPEED) {
            velocidad = MAXSPEED;
        }
    }

    public void frenar(int decremento) {

        velocidad -= decremento;

        if (velocidad < MINSPEED) {
            velocidad = MINSPEED;
        }
    }

}
