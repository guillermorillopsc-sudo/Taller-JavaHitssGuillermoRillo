package ciclos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- Menú de Gestión de Productos ---");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Listar");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Producto creado correctamente.");
                    break;
                case 2:
                    System.out.println("Producto actualizado correctamente.");
                    break;
                case 3:
                    System.out.println("Producto eliminado correctamente.");
                    break;
                case 4:
                    System.out.println("Listando productos...");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intenta de nuevo.");
                    break;
            }
            System.out.println();
        } while (opcion != 5);

        System.out.println("¡Has salido con éxito! 👋");
        entrada.close();
    }
}