
// Q2. Write program to create class name as Factorial with two functions  
//   void setValue(int x): this function accept  number as parameter 
//    int getFactorial(): this function can calculate factorial of number and return it
import java.util.Scanner;

class Factorial {
    private int n;

    public void setValue(int n) {
        this.n = n;
    }

    public int getFactorial() {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

public class DQuestion2 {

    public static void main(String[] args) {

        int num;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the number and i will be show the factorial");
        num = cin.nextInt();
        Factorial f = new Factorial();
        f.setValue(num);
        int result = f.getFactorial();
        System.out.println("show the factorial : " + result);
    }
}
