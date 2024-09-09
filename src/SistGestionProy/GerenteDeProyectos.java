package SistGestionProy;

public class GerenteDeProyectos extends Empleado {
    private int numeroProyectos;

    public GerenteDeProyectos(String nombre, String id, double salarioBase, int numeroProyectos) {
        super(nombre, id, salarioBase);
        this.numeroProyectos = numeroProyectos;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 1000; // Ejemplo de cálculo de salario
    }

    // Getters y Setters
}

