package mamiferos;

public abstract class Felino extends Mamifero {
    protected double tamGarras;
    protected int velocidad;

    public Felino(String habitat, double altura, double largo, double peso, String nombreCientifico,
                  double tamGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamGarras = tamGarras;
        this.velocidad = velocidad;
    }

    public double getTamGarras() { return tamGarras; }
    public int getVelocidad() { return velocidad; }
}
