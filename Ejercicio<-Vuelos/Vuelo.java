import java.time.LocalDateTime;

public class Vuelo {
    private String codigo;
    private String origen;
    private String destino;
    private LocalDateTime fechaHoraLlegada;
    private int pasajeros;

    public Vuelo(String codigo, String origen, String destino,
                 LocalDateTime fechaHoraLlegada, int pasajeros) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.pasajeros = pasajeros;
    }

    public String getCodigo() { return codigo; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public LocalDateTime getFechaHoraLlegada() { return fechaHoraLlegada; }
    public int getPasajeros() { return pasajeros; }

    @Override
    public String toString() {
        return codigo + ": " + origen + " → " + destino +
               ", aterriza el " + fechaHoraLlegada +
               ", pasajeros: " + pasajeros;
    }
}
