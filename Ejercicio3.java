package ciclos;

import java.util.Scanner; // Importa Scanner para leer datos del teclado

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Crea un lector de entrada

        // Variables para acumular sumas y contar notas
        double sumaTotal = 0, sumaMayores = 0, sumaMenores = 0;
        int contMayores = 0, contMenores = 0, contUnos = 0;

        // Bucle para pedir 20 notas
        for (int i = 1; i <= 20; i++) {
            System.out.print("Nota " + i + ": "); // Muestra número de nota a ingresar
            double nota = entrada.nextDouble(); // Lee la nota ingresada

            // Validar rango de nota
            if (nota < 1 || nota > 10) {
                System.out.println("Error: nota fuera de rango."); // Mensaje de error
                return; // Finaliza el programa si la nota no es válida
            }

            sumaTotal += nota; // Acumula para promedio total

            // Clasificar la nota en >=6 o <6
            if (nota >= 6) { 
                sumaMayores += nota; // Suma a las notas mayores o iguales a 6
                contMayores++;       // Cuenta una nota >= 6
            } else { 
                sumaMenores += nota; // Suma a las notas menores que 6
                contMenores++;       // Cuenta una nota < 6
            }

            if (nota == 1) contUnos++; // Si la nota es 1, incrementa su contador
        }

        // Mostrar promedios y resultados
        System.out.println("Promedio >=6: " + (contMayores > 0 ? sumaMayores / contMayores : 0));
        System.out.println("Promedio <6: " + (contMenores > 0 ? sumaMenores / contMenores : 0));
        System.out.println("Notas iguales a 1: " + contUnos);
        System.out.println("Promedio total: " + (sumaTotal / 20));
    }
}
