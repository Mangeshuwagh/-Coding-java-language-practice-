// Q1. Write a program to crate class name as Value with single function name as setValue(int,int) and 
// we have to create three child classes name as Add with function int getAdd() , Mul with function 
// getMul() and Div with function getDiv()  and getAdd() function return addition of two value which  is 
// inherited from Value class , getMul() function return multiplication of two values which is  inherited 
// from Value class and gitDiv() function return division of two values which Is inherited from Value 
// class

import java.util.Scanner;

class Value {

    public int n, n1;

    public void setValue(int n, int n1) {
        this.n = n;
        this.n1 = n1;

    }
}

class Add extends Value {
    public int getAdd() {

        return n + n1;

    }
}

class Mul extends Value {
    public int getMul()

    {
        return n * n1;

    }
}

class Div extends Value {
    public int getDiv() {
        int result = 0;
        if (n < n1) {
            result = n1 / n;
            return result;
        } else {
            result = n / n1;
            return result;
        }
    }
}

/**
 * D3Question1
 */
public class D3Question1 {

    public static void main(String[] args) {

        int n, n1;
        System.out.println("Enter the two numbers: ");
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        n1 = cin.nextInt();
        Add a = new Add();
        a.setValue(n, n1);
        System.out.println(" addition: " + a.getAdd());
        Mul m = new Mul();
        m.setValue(n, n1);
        System.out.println("Multiplication: " + m.getMul());
        Div d = new Div();
        d.setValue(n, n1);
        System.out.println(" show the divistion: " + d.getDiv());

    }
}