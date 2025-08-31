// 2. WAP to create two threads name Even and Odd and Even thread print even values between
// 1 to 10 and Odd thread print odd values between 1 to 10 and use join() methods as well as
// perform this code using synchronization technique also.

import java.lang.*;

class Even extends Thread {

    synchronized void setNumber(int num) {

        try {

            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out
                            .print("Even number " + i);
                    Thread
                            .sleep(1000);

                }
            }

        } catch (Exception ex) {

            System.out.println(" show the Errro " + ex);
        }
    }

    public void run() {
        setNumber(10);
    }

}

class Odd extends Thread {

    synchronized void setNumber(int num) {

        try {

            for (int i = 1; i <= num; i++) {
                if (i % 2 == 1) {
                    System.out.println("Odd number" + i);
                    Thread
                            .sleep(1000);

                }
            }
        } catch (Exception ex) {
            System.out.println(" show the Error" + ex);
        }
    }

    public void run() {
        setNumber(10);
    }

}

public class secondPg {

    public static void main(String[] args) {
        Even e = new Even();
        // e.setNumber(10);
        Odd o = new Odd();
        e.start();
        o.start();
        try {

            e.join();
            o.join();
        } catch (Exception ex) {
            System.out.println("Show the Erro " + ex);
        }

        // o.setNumber(10);

    }

}
