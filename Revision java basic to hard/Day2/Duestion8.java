
// Q7. Write program to create class name as Area with constructor overloading  
//       Area(float radius): this function can accept radius as input and calculate circle Area 
//       Area(int len,int width): this function can accept len and width as input and calculate area of 
// rectangle

import java.util.*;

class Area {
    // float radius;
    // int len, width;

    Area(float radius) {
        // this.radius = radius;
        float CircleArea = 3.14f * radius * radius;
        System.out.println("circle of area: " + CircleArea);
    }

    Area(int len, int width) {
        int rectangle = len * width;
        System.out.println("Area of Rectangle: " + rectangle);
    }

}

public class Duestion8 {
    public static void main(String[] args) {

        int len, width;
        float radius;
        System.out.println("Enter the lenght and width");
        Scanner cin = new Scanner(System.in);
        len = cin.nextInt();
        width = cin.nextInt();

        System.out.println("Enter the radius");
        radius = cin.nextFloat();

        Area circle = new Area(radius);
        Area Reacanglle = new Area(len, width);
    }

}
