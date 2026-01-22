import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            try {
                System.out.println("Insira um dia: ");
                int dia = scanner.nextInt();
                System.out.println("Dia: " + dia + ", " + ObterDia.diaSemana(dia));

                System.out.println("Digite 1 para continuar, 2 para sair.");
                int option = scanner.nextInt();
                switch (option) {
                    case 1 -> { }
                    case 2 -> {
                        System.out.println("Exiting...");
                        running = false;
                    }
                    default -> System.out.println("Opção inválida. Digite 1 ou 2.");
                }

            } catch (InputMismatchException e) {
                System.err.println("Entrada inválida. Digite apenas números.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}