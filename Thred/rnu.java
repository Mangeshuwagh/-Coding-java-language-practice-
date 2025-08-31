
import java.util.*;
import java.lang.*;

class MyprogramThread implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }

}

public class rnu {

    public static void main(String[] args) {

        MyprogramThread myRunnable = new MyprogramThread(); // Create Runnable instance
        Thread thread1 = new Thread(myRunnable); // Pass Runnable to Thread
        Thread thread2 = new Thread(myRunnable);

        thread1.setName("Thread A");
        thread2.setName("Thread B");

        thread1.start(); // Start Thread A
        thread2.start();

    }
}
