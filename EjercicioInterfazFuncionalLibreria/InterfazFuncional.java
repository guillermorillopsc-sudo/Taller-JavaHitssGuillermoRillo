

import java.time.LocalDate;
import java.util.*;
import java.util.function.*;

public class InterfazFuncional {

    // Clase Libro
    static class Libro {
        String titulo;
        String autor;
        int anio;
        double precio;

        public Libro(String titulo, String autor, int anio, double precio) {
            this.titulo = titulo;
            this.autor = autor;
            this.anio = anio;
            this.precio = precio;
        }

        @Override
        public String toString() {
            return titulo + " (" + autor + ", " + anio + ") $" + precio;
        }
    }

    public static void main(String[] args) {

        // ----- Lista de libros -----
        List<Libro> libros = List.of(
            new Libro("Los Ojos de plata", "John Smith", 2020, 305.0),
            new Libro("Metro 2033", "Dmitry Glukhovsky", 2005, 450.0),
            new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, 520.0),
            new Libro("El Hobbit", "J.R.R. Tolkien", 1937, 390.0),
            new Libro("El Principito", "Antoine de Saint-Exupéry", 1943, 250.0)
        );

        // Datos del cliente
        String cliente = "Cristian";
        int edadCliente = 16;

        // ---- Validar edad del cliente (Predicate) ----
        Predicate<Integer> esMayorEdad = edad -> edad >= 18;
        System.out.println("----Validar edad del cliente-----");
        if (esMayorEdad.test(edadCliente)) {
            System.out.println("El cliente es mayor de edad");
        } else {
            System.out.println("El cliente no es mayor de edad");
        }

        // Seleccionamos un libro a comprar
        Libro libroComprado = libros.get(0); // "Los Ojos de plata"
        LocalDate fecha = LocalDate.now();

        // ---- Información de la compra ----
        System.out.println("Cliente: " + cliente);
        System.out.println("Compra: " + libroComprado.titulo);
        System.out.println("Costo: " + libroComprado.precio);
        System.out.println("Fecha: " + fecha);

        // ---- Notificación (Consumer) ----
        Consumer<String> notificar = msg -> System.out.println(msg);
        System.out.println("----Notificación-----");
        notificar.accept("Notificación enviada a Ana: por comprar Metro 2033");

        // ---- Código de venta (Supplier) ----
        Supplier<String> generarCodigo = () -> UUID.randomUUID().toString();
        System.out.println("----Código de venta-----");
        System.out.println("Código: " + generarCodigo.get());

        // ---- Descuento (Function) ----
        Function<Double, Double> aplicarDescuento = precio -> precio * 0.90;
        double precioFinal = aplicarDescuento.apply(libroComprado.precio);
        System.out.println("----Descuento----");
        System.out.println("Aplicar descuento 10% para el libro " + libroComprado.titulo +
                           ", precio final: $" + precioFinal);

        // ---- Extra: Mostrar todos los libros disponibles ----
        System.out.println("\n----Catálogo de libros----");
        libros.forEach(System.out::println);
    }
}