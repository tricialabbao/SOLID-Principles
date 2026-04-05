package SOLIDPrinciples;

public class AlertSender implements Notifier {

    public enum Type { EMAIL, SMS }

    private final Type type;

    public AlertSender(Type type) {
        this.type = type;
    }

    @Override
    public void sendNotification(String recipient) {
        switch (type) {
            case EMAIL:
                System.out.println("Email notification sent to: " + recipient);
                break;
            case SMS:
                System.out.println("SMS notification sent to: " + recipient);
                break;
        }
    }
}