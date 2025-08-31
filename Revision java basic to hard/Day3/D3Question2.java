
// Q2. Write program to create class name Area with methods name as void setRadius(float radius) and 
// void setLengthWidth(int len,int wid) and two child classes name as Circle and Rectangle so you have 
// to define float getCircleArea() method in Circle child class and calculate area of circle and return it 
// and You have to define getRectArea() method in Rectangle class and calculate area of rectangle and 
// return it
import java.util.Scanner;

class Area {
    public float radius;
    public int leng, width;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setLengthWidth(int leng, int width) {
        this.leng = leng;
        this.width = width;
    }

}

class Circle extends Area {

    public float getCircleArea() {
        float CirArea = (float) Math.PI * radius * radius;
        return CirArea;
    }
}

class Rectangle extends Area {
    public int getRectArea() {
        int Rectang = leng * width;
        return Rectang;
    }
}

public class D3Question2 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        float radius;
        int length, width;
        System.out.println("Enter the Radius of Circle: ");
        radius = cin.nextFloat();
        Circle c = new Circle();
        c.setRadius(radius);
        System.out.println(" show the result of Circle of Area: " + c.getCircleArea());

        Rectangle r = new Rectangle();
        System.out.println("Enter the length and width: ");
        length = cin.nextInt();
        width = cin.nextInt();
        r.setLengthWidth(length, width);
        System.out.println("Area of Rectangle: " + r.getRectArea());
    }
}
