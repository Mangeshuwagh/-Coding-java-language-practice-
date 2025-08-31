
// 2. Write a Java program to create an abstract class Shape with abstract
//  methods calculateArea() and calculatePerimeter(). 
//  Create subclasses Circle and Triangle that extend the Shape
//   class and implement the respective methods to calculate the area and perimeter of each shape. 

import java.util.*;

abstract class Shape {
    int Area, length;

    public void setDetails(int Area, int length) {
        this.Area = Area;
        this.length = length;
    }

    abstract void calculateArea();

    abstract void calculatePerimeter();
}

class Circle extends Shape {

    @Override
    void calculateArea() {
        // TODO Auto-generated method stub

    }

}

class Triangle extends Shape {

}

public class Program2nd {

    public static void main(String[] args) {

    }
}
