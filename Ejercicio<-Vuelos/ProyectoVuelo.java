import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class ProyectoVuelo {
    public static void main(String[] args) {
        List<Vuelo> vuelos = Arrays.asList(
            new Vuelo("AAL 933", "New York", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 29, 5, 39), 62),
            new Vuelo("LAT 755", "Sao Paulo", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 31, 4, 45), 47),
            new Vuelo("SKU 621", "Rio De Janeiro", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 30, 16, 0), 52),
            new Vuelo("DAL 147", "Atlanta", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 29, 13, 22), 59),
            new Vuelo("AVA 241", "Bogota", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 31, 14, 5), 25),
            new Vuelo("AMX 10", "Mexico City", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 31, 5, 20), 29),
            new Vuelo("IBE 6833", "Londres", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 30, 8, 45), 55),
            new Vuelo("LAT 2479", "Frankfurt", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 29, 7, 41), 51),
            new Vuelo("SKU 803", "Lima", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 30, 10, 35), 48),
            new Vuelo("LAT 533", "Los Ángeles", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 29, 9, 14), 59),
            new Vuelo("LAT 1447", "Guayaquil", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 31, 8, 33), 31),
            new Vuelo("CMP 111", "Panama City", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 31, 15, 15), 29),
            new Vuelo("LAT 705", "Madrid", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 30, 8, 14), 47),
            new Vuelo("AAL 957", "Miami", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 29, 22, 53), 60),
            new Vuelo("ARG 5091", "Buenos Aires", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 31, 9, 57), 32),
            new Vuelo("LAT 1283", "Cancún", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 31, 4, 0), 35),
            new Vuelo("LAT 579", "Barcelona", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 29, 7, 45), 61),
            new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 30, 7, 12), 58),
            new Vuelo("LAT 501", "París", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 29, 18, 29), 49),
            new Vuelo("LAT 405", "Montevideo", "Santiago",
                    LocalDateTime.of(2021, Month.AUGUST, 30, 15, 45), 39)
        );

        // Ordenar por fecha y hora ascendente
        List<Vuelo> ordenados = new ArrayList<>(vuelos);
        ordenados.sort(Comparator.comparing(Vuelo::getFechaHoraLlegada));

        System.out.println("===== Lista de vuelos ordenados por llegada =====");
        for (Vuelo v : ordenados) {
            System.out.println(v);
        }

        // Último vuelo en llegar
        Vuelo ultimo = ordenados.get(ordenados.size() - 1);

        // Vuelo con menor número de pasajeros
        Vuelo menorPasajeros = Collections.min(ordenados, Comparator.comparing(Vuelo::getPasajeros));

        System.out.println("\nEl último vuelo en llegar es " + ultimo.getCodigo() + ": " +
                ultimo.getOrigen() + ", aterriza el " + ultimo.getFechaHoraLlegada());

        System.out.println("El vuelo con menor número de pasajeros es " + menorPasajeros.getCodigo() + ": " +
                menorPasajeros.getOrigen() + ", con " + menorPasajeros.getPasajeros() + " pasajeros.");
    }
}
