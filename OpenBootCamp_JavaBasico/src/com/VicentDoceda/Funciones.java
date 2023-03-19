package com.VicentDoceda;

public class Funciones {

    public static void main(String[] args) {

        /*holaMundo();
        holaMundo();

        holaMundo("Vicent");
        holaMundo("Pepe");*/

        String hola=devolverHolaMundo();
        System.out.println(hola);
    }
    private static void holaMundo() {
        System.out.println("Hola Mundo");
    }

    private static void holaMundo(String nombre) {
        System.out.println("Hola Mundo " + nombre);
    }



    private static String devolverHolaMundo() {
       return "Hola";
    }

}
