package SistemaUni;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String nombre;
    private String departamento;
    private List<Asignatura> asignaturas;

    public Profesor(String nombre, String departamento) {
        setNombre(nombre);
        setDepartamento(departamento);
        asignaturas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del profesor no puede estar vacio");
        }

        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {

        if (departamento == null || departamento.isEmpty()) {
            throw new IllegalArgumentException("El nombre del departamento del profesor no puede estar vacio");
        }

        this.departamento = departamento;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void asignarAsignatura(Asignatura asignatura) {
        if (asignatura != null) {
            asignaturas.add(asignatura);
        }
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

    @Override
    public String toString() {
        return "- " + nombre + ": " + listarAsignaturas();
    }

}
