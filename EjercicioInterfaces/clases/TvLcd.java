package clases;

import abstractas.Electronico;
import interfaces.IProducto;

public class TvLcd extends Electronico implements IProducto {
    private int precio;
    private int pulgadas;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(fabricante);
        this.precio = precio;
        this.pulgadas = pulgadas;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public double getPrecioVenta() {
        return precio * 1.15; // 15% más
    }

    public int getPulgadas() {
        return pulgadas;
    }
}
