package mamiferos;

public class Perro extends Canino {
    private int fuerzaMordida;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico,
                 String color, double tamColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() { return fuerzaMordida; }

    @Override
    public String comer() {
        return "El Perro salvaje africano caza en grupo usando su fuerza de mordida de " + fuerzaMordida + " psi.";
    }

    @Override
    public String dormir() {
        return "El Perro duerme cerca de la manada en " + habitat;
    }

    @Override
    public String correr() {
        return "El Perro corre en grupo mostrando gran resistencia.";
    }

    @Override
    public String comunicarse() {
        return "El Perro salvaje africano se comunica con ladridos y chillidos.";
    }
}
