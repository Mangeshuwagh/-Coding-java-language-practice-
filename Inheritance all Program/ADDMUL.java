
import java.util.Scanner;

class Parent {

    public int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

}

class Child1add extends Parent {

    public void Add() {
        System.out.println(a + b);
    }
}

class Child2Mul extends Parent {
    public void Mul() {
        System.out.println(" Multiplication : " + a * b);
    }
}

class Child3Div extends Parent {
    public void Div() {
        System.out.println(" Divide : " + b / a);
    }
}

public class ADDMUL {

    public static void main(String[] args) {
        int a, b;
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the fist value");
        a = cin.nextInt();
        System.out.println("Enter the Second Value");
        b = cin.nextInt();
        Child1add c = new Child1add();
        c.setValue(a, b);
        c.Add();

        Child2Mul cm = new Child2Mul();
        cm.setValue(a, b);
        cm.Mul();
        Child3Div cd = new Child3Div();
        cd.setValue(a, b);
        cd.Div();

    }

}
