class PanelAdministrativo {
    private ArrayList<Materia> materias;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Docente> docentes;

    // Constructor
    public PanelAdministrativo() {
        this.materias = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
        this.docentes = new ArrayList<>();
    }

    // Métodos para agregar materias, estudiantes y docentes 
    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarDocente(Docente docente) {
        docentes.add(docente);
    }

    // Métodos para asignar docente a materia y gestionar lista de estudiantes
    public void asignarDocenteAMateria(Materia materia, Docente docente) {
        materia.asignarDocente(docente);
    }

    public void gestionarListaEstudiantes(Materia materia, Estudiante estudiante) {
        materia.inscribirEstudiante(estudiante);
    }
