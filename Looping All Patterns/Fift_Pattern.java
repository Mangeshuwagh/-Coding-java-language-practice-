/*
    * * * * * *
    *       *
    *      *
    *    *
    *   *
    * *
    *      


 */
public class Fift_Pattern {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {

                if (j == 1 || i == 1 || j == 7 - i) {
                    System.err.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            System.err.println();
        }
    }

}

// public class Fift_Pattern {

//     public static void main(String[] args) throws InterruptedException {
//         for (int i = 1; i <= 6; i++) {
//             for (int j = 1; j <= 6; j++) {
//                 // Print stars in the first row or the first column
//                 // Or print stars along the decreasing diagonal
//                 if (i == 1 || j == 1 || j == 7 - i) {
//                     System.out.print("* ");
//                 } else {
//                     // Print spaces elsewhere
//                     System.out.print("  ");
//                 }
//                 // Introduce a delay after printing each character
//                 Thread.sleep(300); // 300 milliseconds delay
//             }
//             // Move to the next line after each row
//             System.out.println();
//             // Additional delay between rows
//             Thread.sleep(500); // 500 milliseconds delay
//         }
//     }
// }

