package test;

import enums.OrderStatus;
import enums.OrderPriority;
import enums.PaymentMethod;
import modelo.Order;

// Clase principal
public class TestMain {
    public static void main(String[] args) {
        // Crear pedidos de ejemplo
        Order order1 = new Order(1, "Ana", OrderStatus.NEW, OrderPriority.HIGH, PaymentMethod.CARD);
        Order order2 = new Order(2, "Luis", OrderStatus.SHIPPED, OrderPriority.MEDIUM, PaymentMethod.CASH);
        Order order3 = new Order(3, "Marta", OrderStatus.DELIVERED, OrderPriority.LOW, PaymentMethod.TRANSFER);

        // Mostrar detalles de cada pedido
        order1.showDetails();
        order2.showDetails();
        order3.showDetails();
    }
}