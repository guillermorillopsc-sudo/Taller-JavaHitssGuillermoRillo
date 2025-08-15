package ciclos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        double precio;
        double totalVentas = 0;
        int contadorProductos = 0;

        do {
            System.out.println("\n======== Menú ========");
            System.out.println("1 - Registrar un pedido");
            System.out.println("2 - Mostrar el total de ventas");
            System.out.println("3 - Salir");
            System.out.print("Elige una opción: ");
            
            respuesta = sc.nextInt();
            System.out.println();

            switch (respuesta) {
                case 1 -> {
                    System.out.println("======= REGISTRANDO PEDIDO =======");
                    do {
                        System.out.print("Ingrese el precio del producto: ");
                        precio = sc.nextDouble();
                        if (precio > 0) {
                            contadorProductos++;
                            totalVentas += precio;
                            System.out.println("Producto registrado correctamente.");
                        } else {
                            System.out.println("Precio inválido. Intente nuevamente.");
                        }
                    } while (precio <= 0);
                }
                case 2 -> {
                    System.out.println("Total de productos vendidos: " + contadorProductos);
                    System.out.println("Total de ventas: $" + totalVentas);
                }
                case 3 -> {
                    System.out.println("Haz salido con éxito.");
                }
                default -> {
                    System.out.println("Ingresa una opción válida.");
                }
            }
        } while (respuesta != 3);

        sc.close();
    }
}