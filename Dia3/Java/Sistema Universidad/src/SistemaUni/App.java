package SistemaUni;

public class App {
    public static void main(String[] args) throws Exception {
        Universidad ugr = new Universidad("UGR");

        Profesor pacoProfe = new Profesor("Paco", "Informática");
        Profesor laiachiProfe = new Profesor("Laiachi", "Logica");

        Estudiante pedroEstudiante = new Estudiante("Pedro", "001");
        Estudiante pepeEstudiante = new Estudiante("Pepe", "001");
        Estudiante susiEstudiante = new Estudiante("Susi", "002");

        Asignatura matesAsignatura = new Asignatura("Mates", 6);
        Asignatura pdooAsignatura = new Asignatura("PDOO", 6);
        Asignatura fsAsignatura = new Asignatura("FS", 6);
        Asignatura esAsignatura = new Asignatura("ES", 3);

        ugr.agregarAsignatura(matesAsignatura);
        ugr.agregarAsignatura(pdooAsignatura);
        ugr.agregarAsignatura(fsAsignatura);
        ugr.agregarAsignatura(esAsignatura);

        ugr.agregarEstudiante(pedroEstudiante);
        ugr.agregarEstudiante(pepeEstudiante);
        ugr.agregarEstudiante(susiEstudiante);

        ugr.agregarProfesor(laiachiProfe);
        ugr.agregarProfesor(pacoProfe);

        ugr.asignarProfesorAAsignatura("Paco", "Mates");
        ugr.asignarProfesorAAsignatura("Paco", "PDOO");
        ugr.asignarProfesorAAsignatura("Paco", "FS");
        ugr.asignarProfesorAAsignatura("Paco", "ES");
        ugr.asignarProfesorAAsignatura("Laiachi", "Mates");

        ugr.matricularEstudianteEnAsignatura("001", "PDOO");
        ugr.matricularEstudianteEnAsignatura("001", "ES");
        ugr.matricularEstudianteEnAsignatura("001", "FS");
        ugr.matricularEstudianteEnAsignatura("002", "Mates");
        ugr.matricularEstudianteEnAsignatura("002", "FS");

        System.out.println(ugr.toString());
    }
}
