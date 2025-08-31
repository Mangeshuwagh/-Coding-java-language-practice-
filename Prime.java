
// import java.util.Scanner;

// public class Prime {

//   public static void main(String[] args) {

//     Scanner cin = new Scanner(System.in);

//     System.out.print(" 1 to 100 prime numbers : \n");

//     for (int i = 1; i <= 100; i++) {
//       int count = 0;
//       int k = i;
//       for (int j = 2; j < k / 2; j++) {
//         if (k % j == 0) {
//           count++;
//           break;
//         }
//       }
//       if (count == 0 && k != 1) {
//         System.out.print("\t" + k);

//       }

//     }
//   }
// }

import java.util.Scanner;

public class Prime {

  public static void main(String[] args) {

    System.out.println("Enter the star and end : \n");
    Scanner cin = new Scanner(System.in);
    int Start = cin.nextInt();
    int end = cin.nextInt();

    // int k = 0;
    int count;
    for (int i = Start; i <= end; i++) {
      count = 0;
      for (int j = 1; j <= i; j++) {

        if (i % j == 0) {
          count++;
        }

      }
      if (count == 2) {
        System.out.print("\t" + i);

      }
    }

  }
}