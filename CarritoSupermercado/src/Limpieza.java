public class Limpieza extends Producto {
    private String tipo;
    private double litros;

    public Limpieza(String nombre, double precio, String tipo, double litros) {
        super(nombre, precio);
        this.tipo = tipo;
        this.litros = litros;
    }

    public String getTipo() {
        return tipo;
    }

    public double getLitros() {
        return litros;
    }
}