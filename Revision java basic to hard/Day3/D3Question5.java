// Q5. Write  Program to perform method overriding you have to create class name as ArrParent with 
// method  
// void setValue(int arr[]): this method can accept array as parameter  
// void arrangeSeq(): this method can display array as per user input sequence 
// You have to create two child class name as ArrangeAscendingOrder and you have to inherit 
// ArrParent class in it and override arrangeSeq() method in ArrangeAscendingOrder and sort array and 
// display in ascending order and you have to create one more class name ReverseArray and override 
// arrangeSeq() method from ArrParent and reverse array and display it.

import java.util.Scanner;

class ArrParent {
    public int a[];

    public void setValue(int a[]) {
        this.a = a;

    }

    void arrangeSeq() {
        System.out.println("Original order:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

class ArrangeAscendingOrder extends ArrParent

{
    @Override
    void arrangeSeq() {
        // super.arrangeSeq();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.println("Array in Asending order:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

class ReverseArray extends ArrParent {
    @Override
    void arrangeSeq() {
        // super.arrangeSeq();

        int end = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            int start = a[i];
            a[i] = a[end];
            a[end] = start;
            end--;

        }
        System.out.println("Array in Revers order:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

}

public class D3Question5 {

    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Enter the 5 elements in  the array: ");
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        ArrParent aa = new ArrParent();
        aa.setValue(a);
        aa.arrangeSeq();

        ArrangeAscendingOrder ascendingOrder = new ArrangeAscendingOrder();
        ascendingOrder.setValue(a); // Set the array for sorting
        ascendingOrder.arrangeSeq(); // Calls the overridden method to sort and display the array

        // Create an object of ReverseArray class
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.setValue(a); // Set the array for reversing
        reverseArray.arrangeSeq(); // Calls the overridden method to reverse and display the array
    }

}
