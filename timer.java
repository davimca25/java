import java.util.Timer;
import java.util.TimerTask;

public class timer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;
            @Override
            public void run() {
                if (count > 0) {
                    System.out.println("Hello, World!");
                    count--;
                } else {
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 1000,1000);
    }
}