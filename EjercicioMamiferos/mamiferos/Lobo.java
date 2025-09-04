package mamiferos;

public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico,
                String color, double tamColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() { return numCamada; }
    public String getEspecieLobo() { return especieLobo; }

    @Override
    public String comer() {
        return "El Lobo " + color + " de especie " + especieLobo + " caza en manada.";
    }

    @Override
    public String dormir() {
        return "El Lobo duerme en las cavernas de " + habitat;
    }

    @Override
    public String correr() {
        return "El Lobo corre coordinadamente con su camada de " + numCamada + " integrantes.";
    }

    @Override
    public String comunicarse() {
        return "El Lobo aúlla para comunicarse con su manada.";
    }
}
