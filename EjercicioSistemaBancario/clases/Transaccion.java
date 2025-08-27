package clases;

public class Transaccion {
    private final int idOperacion;
    private final String tipo;  // "DEPOSITO" o "RETIRO"
    private final double monto;
    private final CuentaBancaria cuenta;

    private static int contador = 1;

    public Transaccion(String tipo, double monto, CuentaBancaria cuenta) {
        this.idOperacion = contador++;
        this.tipo = tipo;
        this.monto = monto;
        this.cuenta = cuenta;
    }

    public int getIdOperacion() {
        return idOperacion;
    }

    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    @Override
    public String toString() {
        return "{idOperacion=" + idOperacion +
                ", tipo='" + tipo + '\'' +
                ", monto=" + String.format("%.2f", monto) +
                ", idCuenta=" + cuenta.getId() +
                "}";
    }
}
