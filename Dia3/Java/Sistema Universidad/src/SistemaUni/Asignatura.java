package SistemaUni;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private String nombre;
    private int creditos;
    private Profesor profesor;
    private List<Estudiante> estudiantes;

    public Asignatura(String nombre, int creditos) {
        setNombre(nombre);
        setCreditos(creditos);
        estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre de la asignatura no puede estar vacio");
        }

        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {

        if (creditos <= 0) {
            throw new IllegalArgumentException("Los creditos de una asignatura no pueden ser menores a 1");
        }

        this.creditos = creditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void matricularEstudiante(Estudiante estudiante) {

        estudiantes.add(estudiante);

    }

    @Override
    public String toString() {
        String cad = "- " + nombre + " Profesor: " + profesor.getNombre();

        return cad;

    }

}
