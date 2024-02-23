// Clase de herencia de Estudiante a Persona
class Estudiante extends Persona {
    private int edad;

    // Constructor
    public Estudiante(String nombre, String apellidos, String identificacion, int edad) {
        super(nombre, apellidos, identificacion);
        this.edad = edad;
    }
}

// Clase de herencia de Docente a Persona
class Docente extends Persona {
    // Constructor
    public Docente(String nombre, String apellidos, String identificacion) {
        super(nombre, apellidos, identificacion);
    }
}
