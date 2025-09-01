package enums;

// Enum que representa los métodos de pago
public enum PaymentMethod {
    CASH("Efectivo"),
    CARD("Tarjeta de crédito/débito"),
    TRANSFER("Transferencia bancaria");

    private String description;

    // Constructor
    PaymentMethod(String description) {
        this.description = description;
    }

    // Getter para la descripción
    public String getDescription() {
        return description;
    }
}