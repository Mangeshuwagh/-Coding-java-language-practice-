
// Q2.Write a java program to create a class name triangle whether Two method name as 
//                    void Setvalue(int  no)  and voidShow() and  Check triangle is  valid or not.
import java.util.Scanner;

class triangle {
    int no1;
    int no2;
    int no3;

    void Setvalue(int a, int b, int c) {
        no1 = a;
        no2 = b;
        no3 = c;

    }

    void Show() {

        if ((no1 + no2 > no3) && (no1 + no3 > no2) && (no3 + no2 > no1)) {

            System.out.println("Tring is the valid ");

        } else {
            System.out.println("Tringle in not valid ");
        }

    }
}

public class Program2nd {
    public static void main(String[] args) {
        int a, b, c;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the tringle  numbers: \n ");
        a = cin.nextInt();
        b = cin.nextInt();
        c = cin.nextInt();
        triangle t = new triangle();
        t.Setvalue(a, b, c);
        t.Show();
    }
}
