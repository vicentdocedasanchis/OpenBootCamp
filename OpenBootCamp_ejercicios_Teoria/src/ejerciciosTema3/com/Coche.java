package ejerciciosTema3.com;

public class Coche {
    private int numPuertas;

    public Coche() {
        numPuertas = 4;
    }

    public void incrementarPuertas() {
        numPuertas++;
    }

    public int obtenerNumPuertas() {
        return numPuertas;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("Número de puertas: " + miCoche.obtenerNumPuertas());
    }
}





