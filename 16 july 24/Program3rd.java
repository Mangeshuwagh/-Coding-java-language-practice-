// Q3. Write a java program to  create a class name MaxValue as  two method  void Setvalue(int no) 
//   and  void Show() and find maximum between two numbers

/**
 * Program3rd
 */
import java.util.Scanner;

class MaxValue {
    int no1, no2;

    void Setvalue(int n1, int n2) {
        no1 = n1;
        no2 = n2;

    }

    void Show() {
        int Max;
        // Max = (no1 > no2) ? no1 : no2;
        if (no1 > no2) {
            Max = no1;
        } else {
            Max = no2;
        }

        System.out.println("Show the Max Value: \n" + Max);
    }
}

public class Program3rd {
    public static void main(String[] args) {

        int no1, no2;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the two numbers and check the max value: \n");

        no1 = cin.nextInt();
        no2 = cin.nextInt();
        MaxValue m = new MaxValue();
        m.Setvalue(no1, no2);
        m.Show();
    }

}