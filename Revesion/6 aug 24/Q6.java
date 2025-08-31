// 16.Write a C program to check whether the triangle is equilateral, isosceles or scalene triangle.

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int angle1, angle2, angle3;

        System.out.println("Enter the Angles ");
        Scanner cin = new Scanner(System.in);
        angle1 = cin.nextInt();
        angle2 = cin.nextInt();
        angle3 = cin.nextInt();
        if (angle1 == angle2 && angle2 == angle3)

        {
            System.out.println("Angle is Equale ");
        }

        else if (angle1 == angle2 || angle2 == angle3) {
            System.out.println("Angle is isolate");

        } else {
            System.out.println("Angle is Scalene ");
        }

    }

}
