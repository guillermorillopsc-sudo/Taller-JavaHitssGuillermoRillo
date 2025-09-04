package clases;

import abstractas.Electronico;
import interfaces.IProducto;

public class IPhone extends Electronico implements IProducto {
    private int precio;
    private String color;
    private String modelo;

    public IPhone(int precio, String fabricante, String color, String modelo) {
        super(fabricante);
        this.precio = precio;
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public double getPrecioVenta() {
        return precio * 1.2; // 20% más
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }
}
