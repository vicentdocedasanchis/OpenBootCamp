package com.Charlie;

public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria();

        cb.mostrarDatos();
        cb.CBU = "2550590940090478135201";
        cb.alias= "miCuenta";
        cb.mostrarDatos();

        System.out.println(cb.obtenerSaldo());
        cb.depositar(1000);
        System.out.println(cb.obtenerSaldo());
        cb.depositar(-1000);
        System.out.println(cb.obtenerSaldo());
        cb.extraer(100);
        System.out.println(cb.obtenerSaldo());
        cb.extraer(900);
        System.out.println(cb.obtenerSaldo());

       /* System.out.println(cb.saldoDisponible(100));
        System.out.println(cb.saldoDisponible(300));*/




    }


}
