package SistemaUni;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String matricula;
    private List<Asignatura> asignaturas;

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        asignaturas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del estudiante no puede estar vacio");
        }

        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {

        if (matricula == null || matricula.isEmpty()) {
            throw new IllegalArgumentException("La matricula del estudiante no puede estar vacia");
        }

        this.matricula = matricula;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void matricular(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    private String listarAsignaturas() {
        if (asignaturas.isEmpty()) {
            return "Asignaturas: { Ninguna asignatura matriculada }";
        } else {
            String asignaturasCad = "";
            Asignatura asignatura;

            for (int i = 0; i < asignaturas.size() - 1; i++) {
                asignatura = asignaturas.get(i);
                asignaturasCad += asignatura.getNombre() + ", ";
            }

            Asignatura ultima = asignaturas.getLast();
            asignaturasCad += ultima.getNombre();

            return String.format("Asignaturas: { %s }", asignaturasCad);
        }
    }

    public boolean iguales(Estudiante estudiante) {
        return matricula == estudiante.matricula;
    }

    @Override
    public String toString() {
        return "- " + nombre + " --> Matricula: " + matricula + " " + listarAsignaturas();
    }

}
