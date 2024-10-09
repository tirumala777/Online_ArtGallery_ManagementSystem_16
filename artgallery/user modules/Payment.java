import java.util.ArrayList;
import java.util.List;

public class Payment {

    private List<String> paymentHistory;
    private double balance;

    // Constructor to initialize payment history and balance
    public Payment(double initialBalance) {
        this.paymentHistory = new ArrayList<>();
        this.balance = initialBalance;
    }

    // Method to make a payment
    public void makePayment(double amount, String artwork) {
        if (balance >= amount) {
            balance -= amount;
            paymentHistory.add("Purchased " + artwork + " for $" + amount);
            System.out.println("Payment successful! You purchased " + artwork + " for $" + amount);
        } else {
            System.out.println("Insufficient balance to complete the purchase.");
        }
    }

    // Method to view payment history
    public void viewPaymentHistory() {
        System.out.println("Payment History:");
        if (paymentHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String transaction : paymentHistory) {
                System.out.println("- " + transaction);
            }
        }
    }

    // Method to add funds to balance
    public void addFunds(double amount) {
        balance += amount;
        System.out.println("Added $" + amount + " to your balance.");
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}
