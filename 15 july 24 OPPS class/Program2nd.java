
// Q. WAP to create class name as Circle with two methods 
// void setRadius(float radius):  this method help us to accept radius as parameter 
// void calArea(): this method can calculate area of circle and display it.

import java.util.Scanner;

class Circle {
    float n;

    void setRadius(float radius) {
        n = radius;
    }

    void calArea() {
        float area = 3.14159f * n * n;
        System.out.println("area of circle: \n" + area);

    }
}

public class Program2nd {
    public static void main(String[] args) {

        Circle a = new Circle();
        float b = 23.5f;
        a.setRadius(b);
        a.calArea();
    }

}
