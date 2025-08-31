// 1.Write a java program to create program for constructor overloading with class name as
// ArrayCons
// ArrayCons (int a []): this function is used for accept array as parameter
// and
// ArrayCons(int a[] , int b[]): this function will accept array as parameter
// and check array is anagram or not

import java.util.Scanner;

class shortArry {
    int a[];

    public int[] ShortA(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {

                    int temp = a[j];

                    a[j] = a[i];
                    a[i] = temp;

                }
            }
        }

        return a;
    }

}

class ArrayCons {

    // private int a[];

    private int a1[];
    private int b[];

    public ArrayCons(int a[]) {

        // this.a = a;
        System.out.println("thise array apccepted: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }

    }

    public ArrayCons(int a1[], int b[]) {

        this.a1 = a1;
        this.b = b;

        if (checkArange(a1, b)) {

            System.out.println("Array is anagram");
        } else {
            System.out.println(" Array is not anagram");
        }

    }

    public boolean checkArange(int a1[], int b[])

    {
        // boolean m = false;
        // boolean m =false;
        if (a1.length != b.length) {
            return false;

        } else {

            shortArry obj1 = new shortArry();
            // shortArry obj2 = new shortArry();
            obj1.ShortA(a1);
            obj1.ShortA(b);

            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != b[i]) {
                    return false;
                }
            }
        }

        return true;
    }

}

public class FirstQuestion {

    public static void main(String[] args) {
        int a[] = new int[5];
        int a1[] = new int[5];
        int b[] = new int[5];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Tp Array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }

        System.out.println("Enter the 1st Array: ");
        for (int i = 0; i < a.length; i++) {
            a1[i] = cin.nextInt();
        }
        System.out.println("Enter the 2nd Array: ");
        for (int i = 0; i < a.length; i++) {
            b[i] = cin.nextInt();
        }

        ArrayCons obj = new ArrayCons(a);
        ArrayCons TwArr = new ArrayCons(a1, b);

    }

}