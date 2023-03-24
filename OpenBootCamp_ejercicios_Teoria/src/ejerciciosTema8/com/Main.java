package ejerciciosTema8.com;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona(); // Crear objeto persona

        // Establecer valores usando los setters
        persona.setEdad(30);
        persona.setNombre("Juan");
        persona.setTelefono("555-1234");

        // Obtener valores usando los getters y mostrarlos por consola
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Teléfono: " + persona.getTelefono());

    }

}

