package mamiferos;

public class Leon extends Felino {
    private int numManada;
    private double potenciaRugidoDecibel;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico,
                double tamGarras, int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() { return numManada; }
    public double getPotenciaRugidoDecibel() { return potenciaRugidoDecibel; }

    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + numManada + " individuos en " + habitat;
    }

    @Override
    public String dormir() {
        return "El León duerme en " + habitat + " bajo la sombra de un árbol.";
    }

    @Override
    public String correr() {
        return "El León corre a " + velocidad + " km/h para atrapar a su presa.";
    }

    @Override
    public String comunicarse() {
        return "El León ruge con " + potenciaRugidoDecibel + " decibeles.";
    }
}
