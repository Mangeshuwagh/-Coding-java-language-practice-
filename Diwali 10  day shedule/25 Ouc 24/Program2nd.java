// Q2. Write a Java program to create a class called "Circle" with a radius attribute. You can
// access and modify this attribute. Calculate the area and circumference of the circle.

import java.util.Scanner;

class Circle {

    private double radius;

    public Circle(double radius)

    {
        this.radius = radius;

    }

    public double getradius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;

    }

    public double getcircumference() {

        return 2 * Math.PI * radius;
    }

}

public class Program2nd {

    public static void main(String[] args) {

        double radius;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Radius: ");

        radius = cin.nextDouble();
        Circle c = new Circle(radius);
        System.out.println("get Radius: " + c.getradius());
        System.out.println("Calculate Area:  " + c.calculateArea());
        System.out.println("caluclulate Circumference: " + c.getcircumference());
    }

}
