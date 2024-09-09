package SistGestionProy;
import java.time.LocalDate;

public class Tarea {
    private String codigo;
    private String descripcion;
    private EstadoTarea estado;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int horasEstimadas;

    public Tarea(String codigo, String descripcion, EstadoTarea estado, LocalDate fechaInicio, LocalDate fechaFin, int horasEstimadas) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horasEstimadas = horasEstimadas;
    }

    // Método para obtener el estado de la tarea
    public EstadoTarea getEstado() {
        return estado;
    }

    // Método para obtener la descripción de la tarea
    public String getDescripcion() {
        return descripcion;
    }
}
