package enums;

// Enum que representa las prioridades del pedido
public enum OrderPriority {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int level;

    // Constructor
    OrderPriority(int level) {
        this.level = level;
    }

    // Getter para el nivel de prioridad
    public int getLevel() {
        return level;
    }
}