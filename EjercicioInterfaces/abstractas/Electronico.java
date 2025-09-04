package abstractas;

import interfaces.IElectronico;

public abstract class Electronico implements IElectronico {
    protected String fabricante;  // #fabricante: String

    public Electronico(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }
}
