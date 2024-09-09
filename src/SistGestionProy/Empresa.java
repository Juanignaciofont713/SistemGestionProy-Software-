package SistGestionProy;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Proyecto> proyectos;
    private List<Empleado> empleados;
    private List<String> clientes;

    public Empresa() {
        this.proyectos = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    @SuppressWarnings("element-type-mismatch")
    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
        if (!clientes.contains(proyecto.getCliente())) {
            clientes.add((String) proyecto.getCliente());
        }
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void generarReporteHorasTrabajadas() {
        // Implementar lógica para generar el reporte
    }

    public void leerDatosDesdeCSV(String archivo) {
        // Implementar lectura desde archivo CSV
    }

    public void escribirDatosACSV(String archivo) {
        // Implementar escritura a archivo CSV
    }

    // Otros métodos según se requiera
}