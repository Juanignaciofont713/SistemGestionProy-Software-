package SistGestionProy;

public class DiseñadorUX extends Empleado {
    private String herramientaDiseño;

    public DiseñadorUX(String nombre, String id, double salarioBase, String herramientaDiseño) {
        super(nombre, id, salarioBase);
        this.herramientaDiseño = herramientaDiseño;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 300; // Ejemplo de cálculo de salario
    }

    // Getters y Setters
}