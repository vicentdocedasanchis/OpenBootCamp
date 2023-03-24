package ejerciciosTema9.com;

public class Persona {
    //atributos
    private int edad;
    private String nombre;
    private String telefono;
    private String ciudad;
    //constructor
    public Persona(int edad, String nombre, String telefono , String ciudad){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ciudad = ciudad;
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
    public String getCiudad() {
        return ciudad;
    }
}
