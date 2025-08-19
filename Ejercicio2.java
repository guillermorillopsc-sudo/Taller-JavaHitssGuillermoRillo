package ciclos;

 import java.util.Scanner;

public class valorMinimo{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a comparar (mínimo 10):");
        int cantidad = entrada.nextInt();

        // Validar que la cantidad sea al menos 10
        if (cantidad < 10) {
            System.out.println("La cantidad debe ser como mínimo 10.");
            entrada.close();
            return;  // Termina el programa si no cumple
        }

        int numeroMenor = Integer.MAX_VALUE;

        // Iterar para pedir los números y encontrar el menor
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Ingrese el número " + i + ":");
            int num = entrada.nextInt();

            if (num < numeroMenor) {
                numeroMenor = num;
            }
        }

        // Muestra resultados
        System.out.println("El número menor es " + numeroMenor);
  
        if (numeroMenor < 10) {
            System.out.println("El número menor es menor que 10.");
        } else {
            System.out.println("El número menor es igual o mayor que 10.");
        }

        entrada.close();
    }
}

