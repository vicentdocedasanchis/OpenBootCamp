package com.Ejercicios;

public class Principal {
    public static void main(String[] args) {
        double precio = 300.0; // precio sin IVA
        double precioConIva = EjercicioT2.calcularPrecioConIva(precio);
        System.out.println("El precio con IVA es: " + precioConIva);
    }
}

class EjercicioT2 {
    public static double calcularPrecioConIva(double precio) {
        double iva = 0.21; // 21% de IVA
        double precioConIva = precio * (1 + iva);
        return precioConIva;
    }
}
