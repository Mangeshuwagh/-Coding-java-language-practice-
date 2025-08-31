// Q3. Write Program create class name as ArrSum with method void setValue(int arr[]) you have to 
// create child class name as GetSum with method  int getArrSum() you have to accept array values 
// from ArrSum and calculate its sum and return it 

import java.util.Scanner;

class ArrSum {
    public int[] a;

    public void setValue(int[] a) {
        this.a = a;
    }
}

class GetSum extends ArrSum {

    public int getArrSum() {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;

    }
}

public class D3Question3 {

    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 5 elments in the array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        GetSum g = new GetSum();
        g.setValue(a);
        int result = g.getArrSum();
        System.out.println("Sum of array elements: " + result);
    }

}
