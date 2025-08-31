import java.util.*;
import java.util.function.Predicate;

class PracticeThread extends Thread {

    public void run() {

        try {
            for (int i = 1; i <= 10; i++) {

                System.out.println(i);
                sleep(1000);

            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(" Show the Exception where the do the misake ");
            System.out.println(e);
        }
    }
}

public class Program1st {

    public static void main(String[] args) {

        System.out.println(" Using the Thread Class ");

        PracticeThread t1 = new PracticeThread();
        t1.start();

    }

}