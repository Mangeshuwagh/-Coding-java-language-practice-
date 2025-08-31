
// class NumebrOfClasses {

//     synchronized void Oddnumber() {
//         for (int i = 1; i <= 10; i++) {
//             if (i % 2 == 1) {
//                 System.out.println("Number is Odd" + i);
//                 try {

//                     Thread.sleep(500);
//                 } catch (Exception e) {
//                     System.out.println(e);
//                 }

//             }
//         }

//     }

//     synchronized void EvenNumber() {
//         for (int j = 1; j <= 10; j++) {

//             if (j % 2 == 0) {

//                 System.out.println("Even Number: " + j);

//             } else {
//                 try {
//                     Thread.sleep(500);
//                 } catch (Exception e) {
//                     System.out.println(e);
//                 }
//             }
//         }
//     }

// }

// class OddNumber extends Thread {
//     NumebrOfClasses number;

//     public void OddNumber(NumebrOfClasses number) {
//         this.number = number;
//     }

//     public void run() {
//         number.Oddnumber();
//     }
// }

// class EventNumber extends Thread {

//     NumebrOfClasses number;

//     public void EventNumber(NumebrOfClasses number) {
//         this.number = number;
//     }

//     public void run() {
//         number.EvenNumber();
//     }
// }

// public class Program2nd {

//     public static void main(String[] args) {

//         NumebrOfClasses number = new NumebrOfClasses();

//         OddNumber o = new OddNumber(number);
//         EventNumber e = new EventNumber(number);

//         // o.setName("Odd Number");
//         // e.setName("Event Number");

//         o.start();
//         e.start();

//         try {
//             e.join();
//             o.join();
//         } catch (InterruptedException x) {
//             System.out.println(x);
//         }

//         System.out.println("Both threads finished.");
//     }
// }

class NumebrOfClasses {

    synchronized void Oddnumber() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println("Odd Number: " + i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    synchronized void EvenNumber() {
        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                System.out.println("Even Number: " + j);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class OddNumber extends Thread {
    NumebrOfClasses number;

    // ✅ Correct constructor (remove void)
    public OddNumber(NumebrOfClasses number) {
        this.number = number;
    }

    public void run() {
        number.Oddnumber();
    }
}

class EventNumber extends Thread {
    NumebrOfClasses number;

    // ✅ Correct constructor (remove void)
    public EventNumber(NumebrOfClasses number) {
        this.number = number;
    }

    public void run() {
        number.EvenNumber();
    }
}

public class Program2nd {
    public static void main(String[] args) {
        NumebrOfClasses number = new NumebrOfClasses();

        // ✅ Now this will work correctly
        OddNumber o = new OddNumber(number);
        EventNumber e = new EventNumber(number);

        o.start();
        e.start();

        try {
            e.join();
            o.join();
        } catch (InterruptedException x) {
            System.out.println(x);
        }

        System.out.println("Both threads finished.");
    }
}
