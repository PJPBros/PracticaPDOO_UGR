package SistemaUni;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private static final int MAXASIGNATURASPROFESOR = 3;

    private String nombre;
    private List<Estudiante> estudiantes;
    private List<Asignatura> asignaturas;
    private List<Profesor> profesores;

    public Universidad(String nombre) {
        setNombre(nombre);
        estudiantes = new ArrayList<>();
        asignaturas = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre de la universidad no puede estar vacio");
        }

        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (!estudianteMatriculado(estudiante)) {
            estudiantes.add(estudiante);
        }
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void matricularEstudianteEnAsignatura(String matricula, String nombreAsignatura) {
        Estudiante estudiante = busquedaMatricula(matricula);
        Asignatura asignatura = busquedaAsignatura(nombreAsignatura);
        asignatura.matricularEstudiante(estudiante);
        estudiante.matricular(asignatura);
    }

    public void asignarProfesorAAsignatura(String nombreProfesor, String nombreAsignatura) {
        Profesor profesor = busquedaProfesor(nombreProfesor);
        Asignatura asignatura = busquedaAsignatura(nombreAsignatura);

        if (profePuedeTrabajar(profesor)) {
            asignatura.setProfesor(profesor);
            profesor.asignarAsignatura(asignatura);
        }

    }

    private Profesor busquedaProfesor(String nombreProfe) {
        Profesor profesorADevolver = null;

        for (Profesor profesor : profesores) {
            if (profesor.getNombre().equals(nombreProfe)) {
                profesorADevolver = profesor;
            }
        }

        if (profesorADevolver == null) {
            throw new IllegalArgumentException("No existe ningun profesor con ese nombre");
        }

        return profesorADevolver;
    }

    private Asignatura busquedaAsignatura(String nombreAsignatura) {
        Asignatura asignaturaADevolver = null;

        for (Asignatura asignatura : asignaturas) {
            if (asignatura.getNombre().equals(nombreAsignatura)) {
                asignaturaADevolver = asignatura;
            }
        }

        if (asignaturaADevolver == null) {
            throw new IllegalArgumentException("No existe asignatura con ese nombre");
        }

        return asignaturaADevolver;
    }

    private Estudiante busquedaMatricula(String matricula) {
        Estudiante estudianteADevolver = null;

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getMatricula().equals(matricula)) {
                estudianteADevolver = estudiante;
            }
        }

        if (estudianteADevolver == null) {
            throw new IllegalArgumentException("No existe ningun estudiante con esa matricula");
        }

        return estudianteADevolver;
    }

    private boolean estudianteMatriculado(Estudiante estudiante) {
        try {
            busquedaMatricula(estudiante.getMatricula());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private boolean profePuedeTrabajar(Profesor profesor) {
        return profesor.getAsignaturas().size() <= MAXASIGNATURASPROFESOR;
    }

    @Override
    public String toString() {
        String cad = "| " + nombre + " |\n";
        cad += "Asignaturas: \n";
        for (Asignatura asignatura : asignaturas) {
            cad += asignatura.toString() + "\n";
        }

        cad += "\n Estudiantes: \n";

        for (Estudiante estudiante : estudiantes) {
            cad += estudiante.toString() + "\n";
        }

        cad += "\n Profesores: \n";

        for (Profesor profesor : profesores) {
            cad += profesor.toString() + "\n";
        }

        return cad;
    }

}
