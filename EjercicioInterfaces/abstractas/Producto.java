package abstractas;

import interfaces.IProducto;

public abstract class Producto implements IProducto {
    protected int precio;  // #precio: int

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
