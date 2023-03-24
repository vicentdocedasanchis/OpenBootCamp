package ejerciciosTema9.com;

public class Trabajador extends Persona {
    // Atributos
    private double salario;
    // constructor
    public Trabajador(int edad, String nombre, String telefono, double salario, String ciudad) {
        super(edad, nombre, telefono, ciudad);
        this.salario = salario;
    }
    // metodos
    public double getSalario() {
        return salario;
    }
}
