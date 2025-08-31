// public Q3. Write Program create class name as ArrSum with method void
// setValue(int arr[]) you have to
// create child class name as GetSum with method int getArrSum() you have to
// accept array values
// from ArrSum and calculate its sum and return it {

// }

import java.util.Scanner;

class ArrSum {
    protected int a[];

    public void setValue(int a[]) {
        this.a = a;
    }

}

class GetSum extends ArrSum

{
    public int gerArrSum() {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

}

class ConQ3 {

    public static void main(String[] args) {

        int a[] = new int[5];
        System.out.print("Enter the elements In the array: \n");
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }

        GetSum g = new GetSum();
        g.setValue(a);

        System.out.print("Show the array Elements Sum: " + g.gerArrSum());
    }
}