import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PalabraMasRepetida {

    public static void main(String[] args) {
        
        // Expresión lambda que recibe una frase y devuelve un Map con la palabra más repetida
        Function<String, Map<String, Integer>> palabraMasRepetida = frase -> {
            // Convertimos la frase en un arreglo de palabras, eliminando signos de puntuación
            String[] palabras = frase.toLowerCase().replaceAll("[^a-záéíóúñü ]", "").split("\\s+");
            
            // Contamos cuántas veces aparece cada palabra usando Collectors.groupingBy
            Map<String, Long> conteo = Arrays.stream(palabras)
                                             .collect(Collectors.groupingBy(p -> p, Collectors.counting()));

            // Encontramos la palabra más repetida
            Map.Entry<String, Long> maxEntry = conteo.entrySet()
                                                     .stream()
                                                     .max(Map.Entry.comparingByValue())
                                                     .orElse(null);

            // Retornamos el resultado como un Map<String, Integer>
            Map<String, Integer> resultado = new HashMap<>();
            if (maxEntry != null) {
                resultado.put(maxEntry.getKey(), maxEntry.getValue().intValue());
            }
            return resultado;
        };

        // Probar la función
        String frase = "Hola mundo hola hola Java mundo Java mundo mundo";
        System.out.println("La frase completa es = " + frase );
        Map<String, Integer> resultado = palabraMasRepetida.apply(frase);

        // Mostrar resultado en consola
        resultado.forEach((palabra, cantidad) -> 
            System.out.println("La palabra más repetida es '" + palabra + "' con " + cantidad + " repeticiones."));
    }
}
