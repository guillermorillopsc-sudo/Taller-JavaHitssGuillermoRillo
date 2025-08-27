package clases;

public class CuentaBancaria {
    private final int id;
    private String titular;
    private double saldo;

    private static int contador = 1;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.id = contador++;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "[Cuenta " + id + "] Titular: " + titular + " | Saldo actual: " + saldo;
    }
}
