abstract class Notification {
    protected String sender;
    protected String receiver;
    protected String message;

    public Notification(String sender, String receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    public abstract void send();
    public abstract void receive();
}
