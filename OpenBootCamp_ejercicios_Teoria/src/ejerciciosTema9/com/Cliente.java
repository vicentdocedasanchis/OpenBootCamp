package ejerciciosTema9.com;

public class Cliente extends Persona {
    //atributos
    private double credito;
    //constructores
    public Cliente(int edad, String nombre, String telefono, double credito, String ciudad) {
        super(edad, nombre, telefono , ciudad);
        this.credito = credito;
    }
    //metodos
    public double getCredito() {
        return credito;
    }
}