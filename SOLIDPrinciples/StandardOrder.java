package SOLIDPrinciples;

public class StandardOrder implements Calculator {
    @Override
    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }
}