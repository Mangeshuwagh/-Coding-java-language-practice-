
// Q1. Write a program to crate class name as Value with single function name as setValue(int,int) and  
// we have to create three child classes name as Add with function int getAdd() , Mul with function  
// getMul() and Div with function getDiv() and getAdd() function return addition of two value which is  
// inherited from Value class , getMul() function return multiplication of two values which is inherited  
// from Value class and gitDiv() function return division of two values which Is inherited from Value  
// class.
import java.util.Scanner;

class Value {
    int n, n1;

    void setValue(int n, int n1) {
        this.n = n;
        this.n1 = n1;
    }
}

class Add extends Value {
    int getAdd() {
        return n + n1;
    }

}

class Mul extends Value {
    int getMul() {
        return n * n1;
    }
}

class Div extends Value {

    int getDiv() {
        int big = 0;
        int sm = 0;
        if (n > n1) {

            big = n;
            sm = n1;

        } else {
            big = n1;
            sm = n;
        }
        return big / sm;
    }
}

class Sub extends Value {

    int getSubt() {
        // {int ans=n-n1;
        return n - n1;
    }
}

/**
 * ConQ1
 */
public class ConQ1 {

    public static void main(String[] args) {
        int nu1, n2;
        System.out.println("Enter the two numbers");

        Scanner cin = new Scanner(System.in);

        nu1 = cin.nextInt();
        n2 = cin.nextInt();

        Add a = new Add();
        a.setValue(nu1, n2);
        System.out.println(" get Addition: " + a.getAdd());
        // System.out.println(" get Addition: " + a.getMul());
        // System.out.println(" get Addition: " + a.getDiv());
        // System.out.println(" get Addition: " + a.getAdd());

        Mul m = new Mul();
        m.setValue(nu1, n2);
        System.out.println(" get Multiplication: " + m.getMul());

        Div d = new Div();
        d.setValue(nu1, n2);
        System.out.println(" get Division: " + d.getDiv());
        Sub s = new Sub();
        s.setValue(nu1, n2);
        System.out.println(" get Vajabaki : " + s.getSubt());
    }
}