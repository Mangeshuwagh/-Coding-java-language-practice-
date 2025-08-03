// 4. WAP to create thread using Runnable interface

import java.util.*;

class mangeshWaghDahiwad implements Runnable {

    public void run() {
        System.out.println(" its a Runnable Threads Working is");
        System.out.println("Current Thread Name: " + Thread.currentThread().getName());
    }
}

public class Program4th {

    public static void main(String[] args) {

        mangeshWaghDahiwad th = new mangeshWaghDahiwad();
        Thread t1 = new Thread(th);
        t1.start();
    }

}
