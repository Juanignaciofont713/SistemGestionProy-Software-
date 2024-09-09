package SistGestionProy;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Empresa
        Empresa empresa = new Empresa();

        // Crear algunos empleados
        Desarrollador dev1 = new Desarrollador("Mateo Font", "DEV001", 3000, "Java");
        DiseñadorUX ux1 = new DiseñadorUX("Martina Font", "UX001", 2800, "Figma");
        GerenteDeProyectos gerente1 = new GerenteDeProyectos("Luis Rodriguez", "GP001", 5000, 3);

        // Agregar empleados a la empresa
        empresa.agregarEmpleado(dev1);
        empresa.agregarEmpleado(ux1);
        empresa.agregarEmpleado(gerente1);

        // Crear un proyecto
        Proyecto proyecto1 = new Proyecto("PROY001", "Sistema de Gestion", LocalDate.now(), LocalDate.of(2024, 12, 31), "Cliente ABC");

        // Asignar empleados al proyecto
        proyecto1.asignarTrabajador(dev1);
        proyecto1.asignarTrabajador(ux1);
        proyecto1.asignarTrabajador(gerente1);

        // Crear tareas
        Tarea tarea1 = new Tarea("T001", "Desarrollar backend", EstadoTarea.PENDIENTE, LocalDate.now(), LocalDate.of(2024, 10, 1), 100);
        Tarea tarea2 = new Tarea("T002", "Diseniar interfaz", EstadoTarea.EN_PROGRESO, LocalDate.now(), LocalDate.of(2024, 9, 30), 80);
        Tarea tarea3 = new Tarea("T003", "Coordinar con cliente", EstadoTarea.PENDIENTE, LocalDate.now(), LocalDate.of(2024, 9, 15), 20);

        // Asignar tareas a empleados
        dev1.asignarTarea(tarea1);
        ux1.asignarTarea(tarea2);
        gerente1.asignarTarea(tarea3);

        // Agregar tareas al proyecto
        proyecto1.asignarTarea(tarea1);
        proyecto1.asignarTarea(tarea2);
        proyecto1.asignarTarea(tarea3);

        // Agregar el proyecto a la empresa
        empresa.agregarProyecto(proyecto1);

        // Calcular el progreso del proyecto
        double progreso = proyecto1.calcularProgreso();
        System.out.println("Progreso del proyecto '" + proyecto1.getNombre() + "': " + progreso + "%");

        // Listar tareas pendientes de un empleado
        System.out.println("Tareas pendientes de " + dev1.getNombre() + ":");
        for (Tarea tarea : dev1.getTareasPendientes()) {
            System.out.println("- " + tarea.getDescripcion());
        }

        // Generar reporte de horas trabajadas (implementar en la clase Empresa)
        empresa.generarReporteHorasTrabajadas();

        // Guardar los datos en un archivo CSV (implementar en la clase Empresa)
        empresa.escribirDatosACSV("proyectos.csv");
    }
}