// Q1. Write a program to print the area of two rectangles having sides (4,5) and (5,8)
// respectively by creating a class named ‘Rectangle’ with a method(function) named ‘Area’ which returns
// the area and length and breadth passed as parameters to its constructor.

import java.util.Scanner;
// import java.util.Scanner;

class Rectangle {

    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int Area() {
        return length * breadth;
    }
}

public class Pragram1st {

    public static void main(String[] args) {

        int length, breadth;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the length, breadth");
        length = cin.nextInt();
        breadth = cin.nextInt();

        Rectangle r = new Rectangle(length, breadth);
        int result = r.Area();
        System.out.println(" Area of rectangle 1:" + result);
        System.out.println("Enter the again length , breadth");
        length = cin.nextInt();
        breadth = cin.nextInt();
        Rectangle r2 = new Rectangle(length, breadth);

        System.out.println(" Area of rectangle 2:" + r2.Area());

    }

}