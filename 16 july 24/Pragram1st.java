// Q1.Write a java program to create a class name   CheckNumber as  two method  void Setvalue(int no)  
//  and void DisplayValue() and expected output number print  even or odd.
//                 Q2.Write a java program to create a class name triangle whether Two method name as 
//                    void Setvalue(int  no)  and voidShow() and  Check triangle is  valid or not.

/**
 * Pragram1st
 */
import java.util.Scanner;

class CheckNumber {
    int a;

    void Setvalue(int no) {
        a = no;
    }

    void DisplayValue() {
        if (a % 2 == 0) {
            System.out.println("Number is Even: \n" + a);

        } else if (a % 2 == 1) {
            System.out.println("Number is odd: \n" + a);
        }
    }

}

public class Pragram1st {

    public static void main(String[] args) {
        int a;
        System.out.println("Enter the number");
        Scanner cin = new Scanner(System.in);
        a = cin.nextInt();
        CheckNumber c = new CheckNumber();

        c.Setvalue(a);
        c.DisplayValue();
    }

}