package SOLIDPrinciples;

public class OrderTest {
    public static void main(String[] args) {

        // Standard order with email notification
        OrderManager emailOrder = new OrderManager(
            new OrderHandler(),
            new AlertSender(AlertSender.Type.EMAIL)
        );
        emailOrder.processOrder(
            10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com"
        );

        System.out.println("---");

        // Discounted order with SMS notification
        OrderManager smsOrder = new OrderManager(
            new OrderHandler(),
            new AlertSender(AlertSender.Type.SMS)
        );
        smsOrder.processOrder(
            10.0, 2, "Jane Smith", "456 Oak Ave", "order_456.pdf", "+1234567890"
        );
    }
}