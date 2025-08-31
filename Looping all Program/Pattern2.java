// public class Pattern2 {
//     public static void main(String[] args) {
//         int i, j;
//         for (i = 1; i <= 3; i++) // coloum
//         {
//             for (j = 1; j <= 5; j++) // row
//             {
//                 if (i == 1 || i == 3 || j == 1 || j == 5) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print(" ");

//                 }

//             }
//             System.out.print("\n");
//         }
//     }

// }

public class Pattern2 {
    public static void main(String[] args) {
        int rows = 3; // Number of rows
        int cols = 5; // Number of columns

        for (int i = 1; i <= rows; i++) { // Iterate through each row
            for (int j = 1; j <= cols; j++) { // Iterate through each column
                // Check if we're on the border of the rectangle
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* "); // Print asterisk followed by a space for borders
                } else {
                    System.out.print(" "); // Print two spaces for inside
                }
            }
            System.out.print("\n"); // Move to the next line after each row
        }
    }
}
