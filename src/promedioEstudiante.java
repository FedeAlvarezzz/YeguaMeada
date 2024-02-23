    // Método para calcular el promedio de calificaciones de un estudiante
    public double calcularPromedioEstudiante(Estudiante estudiante) {
        ArrayList<Double> calificaciones = calificacionesEstudiantes.get(estudiante);
        double total = 0;
        for (double calificacion : calificaciones) {
            total += calificacion;
        }
        return total / calificaciones.size();
    }
