package ejerciciosTema3.com;

public class Suma {
    /* Función con tres parámetros que se suman entre si */
    public static int sumaTresNumeros(int a, int b, int c) {
        int suma = a + b + c;
        return suma;
    }

    public static void main(String[] args) {
        /* Paso de parámetros por valor a la función */
        int num1 = 5;
        int num2 = 7;
        int num3 = 10;
        // Llamada a la funcion
        int resultado = sumaTresNumeros(num1, num2, num3);
        /* Salida resultados */
        System.out.println("La suma de " + num1 + ", " + num2 + " y " + num3 + " es: " + resultado);
    }
}

