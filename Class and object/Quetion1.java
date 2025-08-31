// 1). WAP to create the class name as Circle with a following methods  
// class Circle 
// { 
//    void setRadius(float radius)//accept the radius  
//    { 
//    } 
//    void showArea() 
//    { //write here calculation logics of circle area and display it 
//    } 
// } 
// public class AreaApp 
// { 
//     public static void main(String x[]) 
//     { 
//       //create here object of scanner and accept the radius as input  
//      //create the object of area and call setRadius and pass radius input as parameter 
//      //call showArea() for display the display the area 
//     } 
// } 

import java.util.Scanner;

class Circle {
    float radius;

    void setRadius(float radius) {
        this.radius = radius;
    }

    void showArea() {
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is: " + area);

    }
}

/**
 * Quetion1
 */
public class Quetion1 {

    public static void main(String[] args) {
        float radius;
        System.out.println("Enter the radius: \n");
        Scanner cin = new Scanner(System.in);

        radius = cin.nextFloat();

        Circle C = new Circle();
        C.setRadius(radius);
        C.showArea();

    }
}