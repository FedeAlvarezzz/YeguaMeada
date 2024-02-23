// Método para asignar un docente a la materia
public void asignarDocente(Docente docente) {
    // Verifica si hay un docente asignado a la materia, sino se crea uno nuevo. 
    if (this.docente != null) {
        System.out.println("Ya hay un docente asignado a esta materia.");
        return;
    }

    // Asignar el nuevo docente a la materia
    this.docente = docente;
    System.out.println("Docente asignado correctamente a la materia: " + this.nombre);
}
