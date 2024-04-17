
import java.util.ArrayList; import java.util.List; import java.util.Scanner;

public class TransactionManagement { private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Person client, double amount) {
        transactions.add(new Transaction(client, amount));
    }

    public void displayTransactions() {
        System.out.println("All transactions:");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    public void summary() {
        double sum = 0;
        for (Transaction t : transactions) {
            sum += t.getAmount();
        }
        System.out.println("Total of all transactions: " + sum + " PLN");
        System.out.println("Average transaction amount: " + (sum / transactions.size()) + " PLN");
        System.out.println("Number of transactions: " + transactions.size());
    }

    public static void main(String[] args) {
        TransactionManagement management = new TransactionManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first name:");
            String firstName = scanner.nextLine();
            System.out.println("Enter last name:");
            String lastName = scanner.nextLine();
            System.out.println("Enter address:");
            String address = scanner.nextLine();
            System.out.println("Enter transaction amount:");
            double amount = Double.parseDouble(scanner.nextLine());

            Person person = new Person(firstName, lastName, address);
            management.addTransaction(person, amount);

            System.out.println("Do you want to add another transaction? (yes/no)");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }
        }

        management.displayTransactions();
        management.summary();
        scanner.close();
    }
}