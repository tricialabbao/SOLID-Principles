package SOLIDPrinciples;

public class DiscountedOrder implements Calculator {
    private double discountRate;

    public DiscountedOrder(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double calculateTotal(double price, int quantity) {
        double total = price * quantity;
        return total - (total * discountRate);
    }
}