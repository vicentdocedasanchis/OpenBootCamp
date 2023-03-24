package ejerTem8bis.com;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(25);
        persona.setNombre("Juan Martinez");
        persona.setTelefono("912223556");

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}
