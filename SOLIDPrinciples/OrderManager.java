package SOLIDPrinciples;

public class OrderManager {
    private final Order order;
    private final Notifier notifier;

    public OrderManager(Order order, Notifier notifier) {
        this.order = order;
        this.notifier = notifier;
    }

    public void processOrder(
        double price,
        int quantity,
        String customerName,
        String address,
        String invoiceFile,
        String recipient
    ) {
        double total = order.calculateTotal(price, quantity);
        System.out.println("Order total: $" + total);

        order.placeOrder(customerName, address);
        order.generateInvoice(invoiceFile);
        notifier.sendNotification(recipient);
    }
}