// Q2. Write program to create class name Area with methods name as void setRadius(float radius) and  
// void setLengthWidth(int len,int wid) and two child classes name as Circle and Rectangle so you have  
// to define float getCircleArea() method in Circle child class and calculate area of circle and return it and  
// You have to define getRectArea() method in Rectangle class and calculate area of rectangle and 
// return it

import java.util.Scanner;

class Area {
    protected float radius;
    protected int leng, wid;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setLengthWidth(int leng, int wid) {
        this.leng = leng;

        this.wid = wid;
    }

}

class Circle extends Area {
    public float getCircleArea() {
        return (float) (Math.PI * radius * radius);

    }
}

class Rectangle extends Area {
    public int getRectArea() {
        return leng * wid;
    }
}

public class ConQ2 {
    public static void main(String[] args) {

        float radius;
        int len, wid;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = cin.nextFloat();

        Circle c = new Circle();
        c.setRadius(radius);
        System.out.println("Area of circle: " + c.getCircleArea());

        System.out.println("Enter the length and width");

        len = cin.nextInt();
        wid = cin.nextInt();

        Rectangle r = new Rectangle();
        r.setLengthWidth(len, wid);
        System.out.println(" show the Rectangle: " + r.getRectArea());

    }

}
