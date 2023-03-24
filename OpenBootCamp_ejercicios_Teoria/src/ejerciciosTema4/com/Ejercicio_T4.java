package ejerciciosTema4.com;


public class Ejercicio_T4 {

    public static void main(String[] args) {

        // Ejemplo de if
        int numeroIf = -3;
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

        // Ejemplo de while
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El valor de la variable numeroWhile es: " + numeroWhile);
        }

        // Ejemplo de do-while
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("El valor de la variable numeroDoWhile es: " + numeroDoWhile);
        } while (numeroDoWhile < 0);

        // Ejemplo de for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor de la variable numeroFor es: " + numeroFor);
        }

        // Ejemplo de switch
        String estacion = "aaaaa";
        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("No es una estación");
                break;
        }

    }

}


