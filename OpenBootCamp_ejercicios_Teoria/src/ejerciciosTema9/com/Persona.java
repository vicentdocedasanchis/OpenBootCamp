package ejerciciosTema9.com;

public class Persona {
    //atributos
    private int edad;
    private String nombre;
    private String telefono;
    //constructor
    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    //metodos
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}
