import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        System.out.println("Enter time in seconds: ");

        TimerTask task = new TimerTask() {
            // get user input for countdown time
            int value = scanner.nextInt();

            @Override
            public void run() {
                System.out.println(value);
                value--;
                // stop timer when value reaches 0
                if (value <= 0) {
                    timer.cancel();
                    System.out.println("Time is up!");

                }
            }
        };

        timer.schedule(task, 0,1000);
    }
}