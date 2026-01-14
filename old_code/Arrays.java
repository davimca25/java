import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("CPF LIST LENGTH: ");
        int cpfnum = scanner.nextInt();

        String[] cpf = new String[cpfnum];

        for (int i = 0; i < cpfnum; i++) {
            System.out.println("Enter CPF: ");
            cpf[i] = scanner.next();
        }
        for (int i = 0; i < cpfnum; i++) {
            System.out.println("CPF " + (i + 1) + ": " + cpf[i]);
        }

    }
}


