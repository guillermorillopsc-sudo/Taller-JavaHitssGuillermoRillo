package mamiferos;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico,
                 double tamGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() { return especieTigre; }

    @Override
    public String comer() {
        return "El Tigre de especie " + especieTigre + " caza en " + habitat;
    }

    @Override
    public String dormir() {
        return "El Tigre duerme plácidamente en la selva.";
    }

    @Override
    public String correr() {
        return "El Tigre corre con agilidad alcanzando hasta " + velocidad + " km/h.";
    }

    @Override
    public String comunicarse() {
        return "El Tigre ruge ferozmente en " + habitat;
    }
}
