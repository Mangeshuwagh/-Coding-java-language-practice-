
// // Nilesh Chougule
// // 2:50 PM
// // WAP to create the abstract class name as ArrayOperation with method performOperation() and its two child
// // classes name as sort and Reverse.We need to inherit the ArrayOperation class in sort and Reverse and override the
// // performOperation() method in it and write the logic.
// import java.util.Scanner;

// // import ArrayOperation.Sort;

// abstract class ArrayOperation {

//     abstract void performOperation(int a[]);

//     class Sort extends ArrayOperation {

//         public void performOperation(int a[]) {

//             for (int i = 0; i < a.length; i++) {

//                 for (int j = i + 1; j < a.length; j++) {
//                     if (a[i] > a[j]) {
//                         int temp = a[i];

//                         a[i] = a[j];
//                         a[j] = temp;

//                     }
//                 }
//             }
//             System.out.println("Show the sort array: ");

//             for (int i = 0; i < a.length; i++) {
//                 System.out.print(a[i] + " ");
//             }

//         }
//     }

//     class Reverse {
//         int a[];

//         void performOperation(int a[]) {

//             // Revers the LOGIC
//             int end = a.length - 1;
//             for (int i = 0; i < a.length / 2; i++) {
//                 int start = a[i];

//                 a[i] = a[end];
//                 a[end] = start;
//                 end--;

//             }

//             System.out.println("Show the array In the Revers ");

//             for (int i = 0; i < a.length; i++) {
//                 System.out.print(" " + a[i]);
//             }
//         }

//     }

// }

// public class Quetion1Abstract {

//     public static void main(String[] args) {

//         int a[] = new int[6];
//         Scanner input = new Scanner(System.in);

//         System.out.println("Enter the 5 Elements in the array: ");
//         for (int i = 0; i < a.length; i++) {
//             a[i] = input.nextInt();
//         }

//         // ArrayOperation s = new Sort();
//         // // Sort s = new Sort();
//         // s.performOperation(a);

//         ArrayOperation arrayOperation = new ArrayOperation() {
//             @Override
//             void performOperation(int[] a) {
//                 // No need to implement, as the logic is in child classes
//             }
//         };

//         // ArrayOperation Sort.s = new arrayOperation new Sort()
//         ArrayOperation.Sort s = arrayOperation.new Sort();
//         s.performOperation(a);
//         ArrayOperation.Reverse m = arrayOperation.new Reverse();
//         m.performOperation(a);

//     }
// }

import java.util.*;

abstract class ArrayOperation {

    abstract void performOperation();

}

class Sort extends ArrayOperation {

    int a[];

    public void setArray(int a[]) {
        this.a = a;
    }

    void performOperation() {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];

                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        System.out.println(" Show the asending order");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

}

class Revers extends ArrayOperation {

    int a[];

    void setArraya(int a[]) {
        this.a = a;
    }

    void performOperation() {
        int end = a.length - 1;
        int start = 0;
        for (int i = 0; i < a.length; i++) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;

        }
        System.out.println(" Revers ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

}

public class Quetion1Abstract {

    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Enter the 5 Elements in the array: ");
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();

        }

        Sort s = new Sort();
        s.setArray(a);
        s.performOperation();

        Revers r = new Revers();
        r.setArraya(a);
        r.performOperation();

    }
}
