
import java.util.Scanner;

class Parent {

    public int a, b;

    public void PrintParet() {

        System.out.println(" I Am Parent class: ");
    }

}

class child1 extends Parent {

    public void printChild() {
        System.out.println(" I m Child class ");
    }

}

class Inheritance {

    public static void main(String[] args) {

        Parent p = new Parent();
        // p.PrintParet();
        child1 c = new child1();
        c.PrintParet();
        c.printChild();
        // p.printChild();

    }
}