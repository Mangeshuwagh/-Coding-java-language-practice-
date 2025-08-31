// public 2. WAP to create two threads name Even and Odd and Even thread print even values between
// 1 to 10 and Odd thread print odd values between 1 to 10 and use join() methods as well as
// perform this code using synchronization technique also. {

// }

class MyThreadClas {

    public synchronized void oddNumber() {
        // System.out.println();
        for (int number = 1; number <= 10; number++) {

            if (number % 3 == 1) {
                System.out.println("Odd Numbers: " + number);
                notify();
            } else {
                try {
                    join();

                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }

    }

    // private int number = 1 ;
    public synchronized void EvenNumber() {

        for (int number = 1; number <= 10; number++) {

            if (number % 2 == 0) {
                System.out.println("EvenNumber: " + number);
                notify();

            } else {
                try {

                    wait();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

}

public class Program2nd {

    public static void main(String[] args) {

        MyThreadClas m = new MyThreadClas();
        Thread t1 = new Thread(() -> m.oddNumber(), "Odd");
        Thread t2 = new Thread(() -> m.EvenNumber(), "EvenNumber");

        t1.start();
        t2.start();

        t1.join();
        t2.wait();
        System.out.println("Both threads finished execution.");

    }
}