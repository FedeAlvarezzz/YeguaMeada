public class Materias {
    private String nombre;
    private String codigo;
    private String capaciEstudiantes;
    private EstadoApertura estadoApertura;
    private String indicadorHabilitacion;

    public Materias(String nombre, String codigo, String capaciEstudiantes, EstadoApertura estadoApertura, String indicadorHabilitacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.capaciEstudiantes = capaciEstudiantes;
        this.estadoApertura = estadoApertura;
        this.indicadorHabilitacion = indicadorHabilitacion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCapaciEstudiantes() {
        return capaciEstudiantes;
    }

    public void setCapaciEstudiantes(String capaciEstudiantes) {
        this.capaciEstudiantes = capaciEstudiantes;
    }

    public EstadoApertura getEstadoApertura() {
        return estadoApertura;
    }

    public void setEstadoApertura(EstadoApertura estadoApertura) {
        this.estadoApertura = estadoApertura;
    }

    public String getIndicadorHabilitacion() {
        return indicadorHabilitacion;
    }

    public void setIndicadorHabilitacion(String indicadorHabilitacion) {
        this.indicadorHabilitacion = indicadorHabilitacion;
    }
}


