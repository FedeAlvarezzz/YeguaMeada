public class Main {
    public static void main(String[] args) {
        // Creación e inicialización de instancias para realizar pruebas

        // Creación de un estudiante
        Estudiante estudiante = new Estudiante("Juan", "Pérez", "123456789", 20);
        System.out.println("Estudiante creado: " + estudiante.obtenerInformacion());

        // Inscripción en una materia
        Materia matematicas = new Materia("Matemáticas", "MAT101", 30);
        estudiante.inscribirMateria(matematicas);
        System.out.println("Estudiante inscrito en Matemáticas");

        // Registro de calificaciones
        estudiante.registrarCalificacion(matematicas, 4, 3, 5, 4);
        System.out.println("Calificaciones registradas para Matemáticas");

        // Mostrar calificaciones del estudiante
        VistaEstudiante vistaEstudiante = new VistaEstudiante(estudiante);
        vistaEstudiante.mostrarMateriasYCalificaciones();

        // Pruebas adicionales
        System.out.println("\n--- Otras pruebas ---");

        // Creación e inicialización de un panel administrativo
        PanelAdministrativo panelAdministrativo = new PanelAdministrativo();

        // Asignación de docente a una materia
        Docente docente = new Docente("Pedro", "García", "987654321", null);
        panelAdministrativo.asignarDocenteAMateria(docente, matematicas);
        System.out.println("Docente asignado a Matemáticas");

        // Cierre de una materia
        panelAdministrativo.cerrarMateria(matematicas);
        System.out.println("Matemáticas cerrada");

        // Mostrar lista de estudiantes inscritos en una materia cerrada
        panelAdministrativo.mostrarEstudiantesPorMateria(matematicas);

        // Asignación de calificación de habilitación
        panelAdministrativo.asignarNotaDeHabilitacion(estudiante, matematicas);
        System.out.println("Nota de habilitación asignada");

        // Mostrar calificaciones actualizadas del estudiante
        vistaEstudiante.mostrarMateriasYCalificaciones();
    }
}


