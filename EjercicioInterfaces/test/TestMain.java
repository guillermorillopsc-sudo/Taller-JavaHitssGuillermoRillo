package test;

import interfaces.IProducto;
import clases.*;
import java.util.Date;

public class TestMain {
    public static void main(String[] args) {
        IProducto[] productos = new IProducto[5];

        productos[0] = new IPhone(20000, "Apple", "Negro", "iPhone 14");
        productos[1] = new TvLcd(15000, "Sony", 55);
        productos[2] = new Libro(800, new Date(), "Eric Gamma", "Design Patterns", "Addison Wesley");
        productos[3] = new Libro(900, new Date(), "Martin Fowler", "UML Distilled", "Pearson");
        productos[4] = new Comics(500, new Date(), "Stan Lee", "Spider-Man", "Marvel", "Peter Parker");

        for (IProducto p : productos) {
            System.out.println("Precio base: " + p.getPrecio() + " | Precio venta: " + p.getPrecioVenta());
        }
    }
}
