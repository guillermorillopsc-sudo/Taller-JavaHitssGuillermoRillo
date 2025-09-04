package mamiferos;

public abstract class Canino extends Mamifero {
    protected String color;
    protected double tamColmillos;

    public Canino(String habitat, double altura, double largo, double peso, String nombreCientifico,
                  String color, double tamColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamColmillos = tamColmillos;
    }

    public String getColor() { return color; }
    public double getTamColmillos() { return tamColmillos; }
}
