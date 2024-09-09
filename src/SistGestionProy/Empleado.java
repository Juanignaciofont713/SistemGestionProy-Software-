package SistGestionProy;
import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {
    private String nombre;
    private String id;
    protected double salarioBase;
    private List<Tarea> tareasAsignadas;

    public Empleado(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
        this.tareasAsignadas = new ArrayList<>();
    }

    // Método para obtener el nombre del empleado
    public String getNombre() {
        return nombre;
    }
    
    public abstract double calcularSalario();

    public void asignarTarea(Tarea tarea) {
        tareasAsignadas.add(tarea);
    }

    public List<Tarea> getTareasPendientes() {
        List<Tarea> pendientes = new ArrayList<>();
        for (Tarea tarea : tareasAsignadas) {
            if (tarea.getEstado() == EstadoTarea.PENDIENTE || tarea.getEstado() == EstadoTarea.EN_PROGRESO) {
                pendientes.add(tarea);
            }
        }
        return pendientes;
    }

    // Getters y Setters
}
