import java.util.Scanner;

public class Threads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Runnable run = new Runnable();
        Thread thread = new Thread(run);
        thread.start();

        System.out.println("5 seconds to enter you name");
        System.out.print("enter you name: ");
        String name = scanner.nextLine();
        System.out.printf("hello %s\n", name);

        scanner.close();
    }
}