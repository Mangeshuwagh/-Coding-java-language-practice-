// Q4. Write program to create class name as SortArr with two functions  
//     void setArray(int a[]): this function can accept array as parameter  
//     int [] getSortArray(): this function can perform sorting on array and return sorted array

import java.util.Scanner;

class SortArr {

    private int a[];

    public void setArray(int a[]) {
        this.a = a;
    }

    public int[] getSortArray() {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        return a;
    }
}

public class DQuestion5 {

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 5 elements in the array");

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        SortArr s = new SortArr();
        s.setArray(a);
        int[] b = s.getSortArray();

        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }

    }
}
