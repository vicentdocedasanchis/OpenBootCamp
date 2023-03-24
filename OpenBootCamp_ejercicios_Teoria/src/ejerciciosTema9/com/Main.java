package ejerciciosTema9.com;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Cliente
        Cliente cliente = new Cliente(30, "Juan", "123456789", 5000.0);

        // Mostrar las propiedades del objeto Cliente
        System.out.println("Edad: " + cliente.getEdad() + " Nombre: " + cliente.getNombre() +
                " Teléfono: " + cliente.getTelefono() + " Salario: " + cliente.getCredito());


        // Crear un objeto Trabajador
        Trabajador trabajador = new Trabajador(25, "María", "987654321", 10000.0);

        // Mostrar las propiedades del objeto Trabajador
        System.out.println("Edad: " + trabajador.getEdad() + " Nombre: " + trabajador.getNombre() + " Teléfono: "
                + trabajador.getTelefono() + " Salario: " + trabajador.getSalario());


    }
}