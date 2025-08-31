
// Q6. Write Program to create abstract class name as Value with one abstract and one non abstract 
// method  
// void setValue(int ,int): this is non abstract method with two parameter  
// abstract int getResult(): this is abstract method  
// and you have two child class name as Power and you have to override getResult() method in Power 
// class and calculate power of two values and return it as well as SearchDigit and you have to override 
// getResult() consider first parameter of setValue() is number and second parameter is digit and you 
// have to search digit in number and return it and if digit not found return -1 

import java.util.Scanner;

abstract class Value {
    int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;

    }

    abstract int getResult();

}

class Power extends Value {

    public int getResult() {
        int r = (int) Math.pow(a, b);
        return r;

    }
}

class SearchDigit extends Value {
    public int getResult() {
        int temp = a;
        while (a != 0) {
            int rem = a % 10;
            if (rem == b) {
                return rem;
            }
            a /= 10;
        }
        return -1;
    }

}

public class D3Question6 {

    public static void main(String[] args) {

        int a, b;
        System.out.println("Enter the Numbers: ");
        Scanner cin = new Scanner(System.in);
        a = cin.nextInt();
        b = cin.nextInt();
        Power p = new Power();
        p.setValue(a, b);
        System.out.println(" Power of the numbers: " + p.getResult());

        System.out.println(" Enter the 5digit number for 12345");
        a = cin.nextInt();
        System.out.println("Enter the search number: ");
        b = cin.nextInt();
        SearchDigit s = new SearchDigit();
        s.setValue(a, b);
        int result = s.getResult();

        if (result != -1) {
            System.out.println("number search: " + result);

        } else {
            System.out.println(" number is not found: " + result);
        }
    }

}
