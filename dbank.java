import java.util.InputMismatchException;
import java.util.Scanner;

public class dbank {

    static float balance = 100;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;

        while (running) {

            System.out.println("\n================================");
            System.out.println("          WELCOME TO DBANK       ");
            System.out.println("================================");
            System.out.println(" 1) Show Balance");
            System.out.println(" 2) Deposit");
            System.out.println(" 3) Withdraw");
            System.out.println(" 4) Exit");
            System.out.println("================================");
            System.out.print(" Choose an option: ");
            try {
                switch (scanner.nextInt()) {
                    case 1:
                        balance();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        withdraw();
                        break;
                    case 4:
                        running = false;
                        System.out.println("\nThank you for using DBank!");
                        break;
                    default:
                        System.out.println("\nInvalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Please enter a number.");
                scanner.next();
            }
        }
    }

    private static void deposit() {
        try {
            System.out.print("\nEnter amount to deposit: ");
            float amount = scanner.nextFloat();
            if (amount <= 0) {
                System.out.println("Amount must be a positive number.");
            } else {
            balance += amount;
            System.out.println("Deposit successful!");
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid amount. Please enter a number.");
            scanner.next();
        }
    }

    private static void withdraw() {
        try {
            System.out.print("\nEnter amount to withdraw: ");
            float amount = scanner.nextFloat();
            if (amount > balance ) {
                System.out.println("Insufficient funds.");
            } else if (amount <= 0) {
                System.out.println("Amount must be a positive number.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful!");
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid amount. Please enter a number.");
            scanner.next();
        }
    }

    private static void balance() {
        System.out.printf("\nCurrent balance: $%.2f%n", balance);
    }
}
