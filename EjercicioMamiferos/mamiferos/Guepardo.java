package mamiferos;

public class Guepardo extends Felino {
    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico,
                    double tamGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El Guepardo caza solo en las llanuras de " + habitat;
    }

    @Override
    public String dormir() {
        return "El Guepardo duerme bajo la sombra en " + habitat;
    }

    @Override
    public String correr() {
        return "El Guepardo corre hasta " + velocidad + " km/h, siendo el más rápido.";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo se comunica con chillidos y ronroneos.";
    }
}
