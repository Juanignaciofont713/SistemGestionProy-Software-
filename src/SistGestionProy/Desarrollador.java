package SistGestionProy;

public class Desarrollador extends Empleado {
    private String lenguaje;

    public Desarrollador(String nombre, String id, double salarioBase, String lenguaje) {
        super(nombre, id, salarioBase);
        this.lenguaje = lenguaje;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 500; // Ejemplo de cálculo de salario
    }

}
