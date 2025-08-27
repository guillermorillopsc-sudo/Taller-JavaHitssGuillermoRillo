package clases;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<CuentaBancaria> cuentas;
    private List<Transaccion> transacciones;

    public Banco() {
        cuentas = new ArrayList<>();
        transacciones = new ArrayList<>();
    }

    public CuentaBancaria crearCuenta(String titular, double depositoInicial) {
        CuentaBancaria cuenta = new CuentaBancaria(titular, depositoInicial);
        cuentas.add(cuenta);
        return cuenta;
    }

    public void depositar(CuentaBancaria cuenta, double monto) {
        cuenta.depositar(monto);
        transacciones.add(new Transaccion("DEPOSITO", monto, cuenta));
        System.out.println("+ Deposito de " + monto + " en la cuenta de " + cuenta.getTitular() +
                " (Saldo actual: " + cuenta.getSaldo() + ")");
    }

    public void retirar(CuentaBancaria cuenta, double monto) {
        if (cuenta.retirar(monto)) {
            transacciones.add(new Transaccion("RETIRO", monto, cuenta));
            System.out.println("- Retiro de " + monto + " en la cuenta de " + cuenta.getTitular() +
                    " (Saldo actual: " + cuenta.getSaldo() + ")");
        } else {
            System.out.println("⚠ Fondos insuficientes en la cuenta de " + cuenta.getTitular());
        }
    }

    public void mostrarCuentas() {
        System.out.println("====== CUENTAS CREADAS ======");
        for (CuentaBancaria c : cuentas) {
            System.out.println(c);
        }
    }

    public void mostrarSaldosFinales() {
        System.out.println("\n====== SALDOS FINALES ======");
        for (CuentaBancaria c : cuentas) {
            System.out.println(c.getTitular() + " → $" + c.getSaldo());
        }
    }

    public void mostrarTransacciones() {
        System.out.println("\n====== HISTORIAL DE TRANSACCIONES ======");
        for (Transaccion t : transacciones) {
            System.out.println(t);
        }
    }
}
