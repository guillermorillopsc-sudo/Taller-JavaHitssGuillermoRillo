package test;

import clases.Banco;
import clases.CuentaBancaria;

public class testMain {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Crear cuentas
        CuentaBancaria Guillermo = banco.crearCuenta("Guillermo", 4000);
        CuentaBancaria Lalo = banco.crearCuenta("Lalo", 8000);

        // Mostrar cuentas iniciales
        banco.mostrarCuentas();

        System.out.println("\n--- Operaciones realizadas ---");

        // Operaciones
        banco.depositar(Guillermo, 1500);
        banco.retirar(Guillermo, 500);

        banco.retirar(Lalo, 2000);
        banco.depositar(Lalo, 1200);

        // Mostrar saldos finales
        banco.mostrarSaldosFinales();

        // Mostrar transacciones
        banco.mostrarTransacciones();
    }
}
