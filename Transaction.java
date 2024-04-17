public class Transaction {
    private Person client;
    private double amount;

    public Transaction(Person client, double amount) {
        this.client = client;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Client: " + client.toString() + ", Amount: " + amount + " PLN";
    }
}