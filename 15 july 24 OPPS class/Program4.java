// Q. WAP to create class name as Power with two functions 
// void setValue(int base,int index): this method can accept base and index value
// void calPower(): this method can calculate power of number and display it.

import java.util.*;

class Power {
    int in, bas;

    void setValue(int index, int base) {
        in = index;
        bas = base;

    }

    void calPower() {
        int result = 1;
        for (int i = 1; i <= in; i++) {
            result *= bas;

        }
        System.out.println(" Power of number: \n" + result);
    }
}

public class Program4 {
    public static void main(String[] args) {
        int index, base;
        System.out.println("Enter the base and index: \n");
        Scanner cin = new Scanner(System.in);
        base = cin.nextInt();
        index = cin.nextInt();
        Power p = new Power();
        p.setValue(index, base);
        p.calPower();
    }
}
