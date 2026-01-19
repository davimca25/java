import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        int n = 0;
        try {
            System.out.print("Enter # of numbers: ");
            n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.printf("Enter Number#%s: ", i);
                numbers.add(scanner.next());
            }
            System.out.println("Your list: " + numbers);

        } catch (InputMismatchException e) {
            System.err.println("Please enter an integer");

        } catch (Exception e) {
            System.err.println("Something went wrong");
        } finally {
            scanner.close();
        }
    }
}
