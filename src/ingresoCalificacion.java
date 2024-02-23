// Método para ingresar calificaciones de un estudiante
    public void ingresarCalificaciones(Estudiante estudiante, ArrayList<Double> calificaciones) {
        // Verificar si el estudiante está inscrito en la materia 
        if (!estudiantesInscritos.contains(estudiante)) {
            System.out.println("El estudiante no está inscrito en esta materia.");
            return;
        }
      
        // Asignar las calificaciones al estudiante
        calificacionesEstudiantes.put(estudiante, calificaciones);
        System.out.println("Calificaciones ingresadas correctamente para el estudiante: " + estudiante.nombre);
    }
}
