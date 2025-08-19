package arreglos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cuantos numeros tendra el arreglo?: ");
        int tamaño = entrada.nextInt();

        int[] arreglo = new int[tamaño];

        System.out.println("Ingresa los numeros:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt();
        }

        int numeroRepetido = arreglo[0];
        int mayorOcurrencias = 0;

        for (int num : arreglo) {
            int contador = 0;

            for (int n : arreglo) {
                if (num == n) {
                    contador++;
                }
            }

            if (contador > mayorOcurrencias) {
                mayorOcurrencias = contador;
                numeroRepetido = num;
            }
        }

        System.out.println("\nLa mayor ocurrencia es: " + mayorOcurrencias);
        System.out.println("El elemento que mas se repite es: " + numeroRepetido);

        entrada.close();
    }
}