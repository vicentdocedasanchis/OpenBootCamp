package ejerciciosTema9.com;

public class Cliente extends Persona {
    //atributos
    private double credito;
    //constructores
    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }
    //metodos
    public double getCredito() {
        return credito;
    }
}