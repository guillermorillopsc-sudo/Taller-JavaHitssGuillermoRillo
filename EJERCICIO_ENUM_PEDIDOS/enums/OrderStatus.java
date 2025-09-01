
package enums;

// Enum que representa los estados de un pedido
public enum OrderStatus {
    NEW("Pedido creado"),
    PROCESSING("Pedido en proceso"),
    SHIPPED("Pedido enviado"),
    DELIVERED("Pedido entregado"),
    CANCELLED("Pedido cancelado");

    private String message;

    // Constructor
    OrderStatus(String message) {
        this.message = message;
    }

    // Getter para el mensaje asociado
    public String getMessage() {
        return message;
    }
}