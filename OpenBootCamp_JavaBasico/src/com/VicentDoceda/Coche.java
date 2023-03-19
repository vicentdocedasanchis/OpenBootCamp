package com.VicentDoceda;

public class Coche {

    //Atributos

    String color;
    String fabricante;
    String modelo;

   double peso;
   double largo;
   int velocidad = 0;
   Motor motor;//encapsulamiento de la clase Motor



    //Constructores

    public Coche() {
    }

    public Coche(String color, String fabricante, String modelo, double peso, double largo, int velocidad) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
        this.velocidad = velocidad;

    }

    //Comportamientos

    public void acelerar(int cantidad) {
        if (cantidad > 0 && cantidad <= velocidad) {
            this.velocidad += cantidad;
        }


    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
