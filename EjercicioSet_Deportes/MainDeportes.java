import java.util.*;

public class MainDeportes {
    static Set<Jugador> futbol = new LinkedHashSet<>();
    static Set<Jugador> basket = new LinkedHashSet<>();
    static Set<Jugador> volei  = new LinkedHashSet<>();
    static Scanner sc = new Scanner(System.in);

    static Comparator<Jugador> NAME_COMPARATOR = Comparator
            .comparing(Jugador::getNombre, String.CASE_INSENSITIVE_ORDER)
            .thenComparingInt(Jugador::getId);
    static Comparator<Jugador> ID_COMPARATOR = Comparator.comparingInt(Jugador::getId);

    public static void main(String[] args) {
        precargarJugadores();
        System.out.println("Programa de gestión de torneo (datos precargados).");
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero();
            switch (opcion) {
                case 0: runDemo(); break;
                case 1: registrarJugadorMenu(); break;
                case 2: mostrarJugadoresHashSet(true); break;
                case 3: mostrarJugadoresLinkedHashSet(true); break;
                case 4: mostrarJugadoresTreeSet(true); break;
                case 5: fusionarEquipos(true); break;
                case 6: jugadoresComunes(true); break;
                case 7: transferirJugadorMenu(); break;
                case 8: rankingPorID(true); break;
                case 9: buscarJugadorMenu(); break;
                case 10: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida.");
            }
        } while (opcion != 10);
    }

    static void mostrarMenu() {
        System.out.println("\n===== Menu Deportes =====");
        System.out.println("0. Ejecutar demo automático");
        System.out.println("1. Registrar jugador en disciplina");
        System.out.println("2. Mostrar jugadores por deporte (HashSet)");
        System.out.println("3. Mostrar jugadores en orden de inscripción (LinkedHashSet)");
        System.out.println("4. Mostrar jugadores por nombre (TreeSet)");
        System.out.println("5. Fusionar equipos (Futbol + Basket)");
        System.out.println("6. Ver jugadores en común (Futbol ∩ Basket)");
        System.out.println("7. Transferir un jugador de un deporte a otro");
        System.out.println("8. Mostrar ranking de jugadores por ID");
        System.out.println("9. Buscar jugador por ID");
        System.out.println("10. Salir");
        System.out.print("Elegir opcion: ");
    }

    static void precargarJugadores() {
        futbol.add(new Jugador(2, "alan"));
        futbol.add(new Jugador(15, "juan"));
        futbol.add(new Jugador(3, "david"));
        futbol.add(new Jugador(1, "ferrer"));
        basket.add(new Jugador(4, "anna"));
        basket.add(new Jugador(7, "lalo"));
        basket.add(new Jugador(2, "alan"));
        basket.add(new Jugador(15, "juan"));
        basket.add(new Jugador(3, "david"));
        volei.add(new Jugador(4, "anna"));
    }

    static void runDemo() {
        System.out.println("\n=== EJECUCIÓN DEMO ===\n");
        mostrarJugadoresHashSet(false);
        mostrarJugadoresLinkedHashSet(false);
        mostrarJugadoresTreeSet(false);
        fusionarEquipos(false);
        jugadoresComunes(false);
        System.out.println("\n-- Transferencia DEMO: mover jugador id=7 de Basket a Futbol --");
        transferirJugadorDemo(7, basket, futbol);
        System.out.println("\nEstado final tras transferencia:");
        mostrarSetSimple("Futbol", futbol);
        mostrarSetSimple("Basket", basket);
        rankingPorID(false);
        System.out.println("\n=== FIN DEL DEMO ===\n");
    }

    static void mostrarJugadoresHashSet(boolean pauseAfter) {
        System.out.println("\n--- HashSet ---");
        Set<Jugador> fHash = new HashSet<>(futbol);
        Set<Jugador> bHash = new HashSet<>(basket);
        Set<Jugador> vHash = new HashSet<>(volei);
        System.out.print("Jugadores en Futbol: "); imprimirListaCompacta(fHash);
        System.out.println("Total futbol: " + fHash.size());
        System.out.print("Jugadores en Basket: "); imprimirListaCompacta(bHash);
        System.out.println("Total basket: " + bHash.size());
        System.out.print("Jugadores en Voleibol: "); imprimirListaCompacta(vHash);
        System.out.println("Total voleibol: " + vHash.size());
        LinkedHashSet<Jugador> todos = new LinkedHashSet<>();
        todos.addAll(futbol); todos.addAll(basket); todos.addAll(volei);
        System.out.println("\n===== Todos los jugadores =====");
        for (Jugador j : todos) System.out.println("Id: " + j.getId() + ", Nombre: " + j.getNombre());
        if (pauseAfter) pausa();
    }

    static void mostrarJugadoresLinkedHashSet(boolean pauseAfter) {
        System.out.println("\n--- LinkedHashSet ---");
        System.out.print("Futbol: "); imprimirListaCompacta(new LinkedHashSet<>(futbol));
        System.out.print("Basket: "); imprimirListaCompacta(new LinkedHashSet<>(basket));
        System.out.print("Volei: "); imprimirListaCompacta(new LinkedHashSet<>(volei));
        if (pauseAfter) pausa();
    }

    static void mostrarJugadoresTreeSet(boolean pauseAfter) {
        System.out.println("\n--- TreeSet (alfabetico) ---");
        TreeSet<Jugador> fTree = new TreeSet<>(NAME_COMPARATOR);
        TreeSet<Jugador> bTree = new TreeSet<>(NAME_COMPARATOR);
        TreeSet<Jugador> vTree = new TreeSet<>(NAME_COMPARATOR);
        fTree.addAll(futbol); bTree.addAll(basket); vTree.addAll(volei);
        System.out.print("Futbol: "); imprimirListaCompacta(fTree);
        System.out.print("Basket: "); imprimirListaCompacta(bTree);
        System.out.print("Volei: "); imprimirListaCompacta(vTree);
        if (pauseAfter) pausa();
    }

    static void fusionarEquipos(boolean pauseAfter) {
        System.out.println("\n--- Fusion Futbol + Basket ---");
        Set<Jugador> union = new LinkedHashSet<>();
        union.addAll(futbol); union.addAll(basket);
        imprimirListaCompacta(union);
        if (pauseAfter) pausa();
    }

    static void jugadoresComunes(boolean pauseAfter) {
        System.out.println("\n--- Comunes Futbol ∩ Basket ---");
        Set<Jugador> comun = new HashSet<>(futbol);
        comun.retainAll(basket);
        imprimirListaCompacta(comun);
        if (pauseAfter) pausa();
    }

    static void transferirJugadorMenu() {
        System.out.println("\n--- Transferir jugador ---");
        System.out.print("Ingrese ID: ");
        int id = leerEntero();
        System.out.println("Origen: 1.Futbol 2.Basket 3.Volei");
        int origen = leerEntero();
        System.out.println("Destino: 1.Futbol 2.Basket 3.Volei");
        int destino = leerEntero();
        Set<Jugador> sOrigen = getDisciplina(origen);
        Set<Jugador> sDestino = getDisciplina(destino);
        if (sOrigen == sDestino) { System.out.println("Origen y destino iguales."); pausa(); return; }
        Jugador encontrado = buscarPorIdEnSet(id, sOrigen);
        if (encontrado != null) {
            sOrigen.remove(encontrado);
            sDestino.add(encontrado);
            System.out.println("Transferido: " + encontrado);
        } else System.out.println("No encontrado.");
        pausa();
    }

    static void transferirJugadorDemo(int id, Set<Jugador> origen, Set<Jugador> destino) {
        Jugador encontrado = buscarPorIdEnSet(id, origen);
        if (encontrado != null) {
            origen.remove(encontrado);
            destino.add(encontrado);
            System.out.println("Transferido DEMO: " + encontrado);
        } else System.out.println("No encontrado en origen.");
    }

    static void rankingPorID(boolean pauseAfter) {
        System.out.println("\n--- Ranking por ID ---");
        TreeSet<Jugador> ranking = new TreeSet<>(ID_COMPARATOR);
        ranking.addAll(futbol); ranking.addAll(basket); ranking.addAll(volei);
        for (Jugador j : ranking) System.out.println("Id: " + j.getId() + ", Nombre: " + j.getNombre());
        if (pauseAfter) pausa();
    }

    static void buscarJugadorMenu() {
        System.out.print("Ingrese ID: ");
        int id = leerEntero();
        boolean found = false;
        Set<Jugador>[] disciplinas = new Set[]{futbol, basket, volei};
        String[] nombres = new String[]{"Futbol", "Basket", "Volei"};
        for (int i = 0; i < disciplinas.length; i++) {
            Jugador j = buscarPorIdEnSet(id, disciplinas[i]);
            if (j != null) { System.out.println("Encontrado en " + nombres[i] + ": " + j); found = true; }
        }
        if (!found) System.out.println("No existe en ninguna disciplina.");
        pausa();
    }

    static Set<Jugador> getDisciplina(int opcion) {
        switch (opcion) {
            case 1: return futbol;
            case 2: return basket;
            case 3: return volei;
            default: return new HashSet<>();
        }
    }

    static Jugador buscarPorIdEnSet(int id, Set<Jugador> set) {
        for (Jugador j : set) if (j.getId() == id) return j;
        return null;
    }

    static void imprimirListaCompacta(Collection<Jugador> col) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        boolean first = true;
        for (Jugador j : col) {
            if (!first) sb.append(", ");
            sb.append("Jugador |Id: ").append(j.getId()).append(", Nombre: ").append(j.getNombre()).append("|");
            first = false;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    static void mostrarSetSimple(String titulo, Collection<Jugador> col) {
        System.out.print(titulo + ": ");
        imprimirListaCompacta(col);
    }

    static void pausa() {
        System.out.println("\nPresiona ENTER para continuar...");
        try { sc.nextLine(); } catch (NoSuchElementException ex) {}
    }

    static int leerEntero() {
        while (true) {
            try { return Integer.parseInt(sc.nextLine().trim()); }
            catch (Exception e) { System.out.print("Valor inválido. Ingrese número: "); }
        }
    }

    static void registrarJugadorMenu() {
        System.out.println("\n--- Registrar jugador ---");
        System.out.print("Ingrese ID: ");
        int id = leerEntero();
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine().trim();
        System.out.println("Seleccione disciplina: 1.Futbol 2.Basket 3.Volei");
        int d = leerEntero();
        Jugador j = new Jugador(id, nombre);
        Set<Jugador> set = getDisciplina(d);
        if (set.contains(j)) System.out.println("Duplicado, ya inscrito.");
        else { set.add(j); System.out.println("Registrado: " + j); }
        pausa();
    }
}
