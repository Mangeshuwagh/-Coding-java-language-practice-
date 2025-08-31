
// Q. WAP to create class name as Factorial  with two functions 
// void setValue(int no): this function can accept number as parameter
// void calFactorial(): this function can calculate  factorial of number and display it.

import java.util.*;

class fact {
    int no;

    void setValue(int No) {
        no = No;

    }

    void calFactorial() {
        int result = 1;
        for (int i = 1; i <= no; i++) {
            result = result * i;

        }
        System.out.println("Show the ans: " + result);
    }
}

public class Factorial {

    public static void main(String[] args) {
        int a;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the numbers show the factorial: \n");
        a = cin.nextInt();
        fact f = new fact();
        f.setValue(a);
        f.calFactorial();
    }
}
