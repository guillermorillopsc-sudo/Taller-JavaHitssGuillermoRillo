public class Jugador {
    private final int id;
    private final String nombre;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "Jugador |Id: " + id + ", Nombre: " + nombre + "|";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jugador)) return false;
        Jugador j = (Jugador) o;
        return this.id == j.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
