    // Métodos para manejar estudiantes
    public void inscribirEstudiante(Estudiante estudiante) {
        if (estudiantesInscritos.size() < capacidadMaxima) {
            estudiantesInscritos.add(estudiante);
            calificacionesEstudiantes.put(estudiante, new ArrayList<>());
        } else {
            System.out.println("La materia ya alcanzó su capacidad máxima de estudiantes.");
        }
    }

