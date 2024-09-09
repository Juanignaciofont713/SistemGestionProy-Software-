package SistGestionProy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String codigo;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaEstimadaFin;
    private String cliente;
    private List<Empleado> trabajadores;
    private List<Tarea> tareas;

    public Proyecto(String codigo, String nombre, LocalDate fechaInicio, LocalDate fechaEstimadaFin, String cliente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaEstimadaFin = fechaEstimadaFin;
        this.cliente = cliente;
        this.trabajadores = new ArrayList<>();
        this.tareas = new ArrayList<>();
    }

    public void asignarTrabajador(Empleado empleado) {
        trabajadores.add(empleado);
    }

    public void asignarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public double calcularProgreso() {
        int completadas = 0;
        for (Tarea tarea : tareas) {
            if (tarea.getEstado() == EstadoTarea.COMPLETADA) {
                completadas++;
            }
        }
        return (completadas / (double) tareas.size()) * 100;
    }
    
    // Método para obtener el nombre del proyecto
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el cliente del proyecto
    public String getCliente() {
        return cliente;
    }
    
}