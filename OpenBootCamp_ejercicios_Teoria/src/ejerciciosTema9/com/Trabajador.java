package ejerciciosTema9.com;

public class Trabajador extends Persona {
    // Atributos
    private double salario;
    // constructor
    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }
    // metodos
    public double getSalario() {
        return salario;
    }
}
