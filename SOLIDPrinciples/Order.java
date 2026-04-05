package SOLIDPrinciples;

public interface Order extends Calculator {
    void placeOrder(String customerName, String address);
    void generateInvoice(String fileName);
}