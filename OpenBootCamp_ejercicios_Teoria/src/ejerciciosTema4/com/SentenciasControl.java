package ejerciciosTema4.com;

public class SentenciasControl {
    public static void main(String[] args) {

        // Comparando con if
        int numeroIf = 3;

        if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Bucle While
        int numeroWhile = 1;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El valor de la variable en el bucle While es: " + numeroWhile);
        }

        // Bucle Do While
        int numeroDoWhile = 0;

        do {
            numeroDoWhile++;
            System.out.println("El valor de la variable en el bucle Do While es: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        // Bucle For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor de la variable en el bucle For es: " + numeroFor);
        }

        // Switch
        String estacion = "Invierno";

        switch (estacion) {
            case "Primavera":
                System.out.println("Estamos en Primavera.");
                break;
            case "Verano":
                System.out.println("Estamos en Verano.");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño.");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno.");
                break;
            default:
                System.out.println("El valor de la variable no es una estación.");
                break;
        }

    }
}
