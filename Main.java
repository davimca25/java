import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean email_list = true;

        ArrayList<String> emails = new ArrayList<>();

        do {
            System.out.print("Enter email or press 'q' to exit.\n: ");
            String email = scanner.nextLine();
            email = email.toLowerCase();

            if (email.equalsIgnoreCase("q")) {
                email_list = false;
            }else if (!email.endsWith("@gmail.com")) {
                System.out.println("Invalid email address, try again.");
            }else if (emails.contains(email)) {
                    System.out.println("Email already added.");
            }else {
                emails.add(email);
            }

        }while (email_list);

        System.out.println(emails);

        scanner.close();
    }
}