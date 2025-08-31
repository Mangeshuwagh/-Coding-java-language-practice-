// 20.Write a C program to input basic salary of an employee and calculate its Gross salary according to following:
// Basic Salary <= 10000 : HRA = 20%, DA = 80%
// Basic Salary <= 20000 : HRA = 25%, DA = 90%
// Basic Salary > 20000 : HRA = 30%, DA = 95%

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        int Salary;
        System.out.println("Enter the Salary");
        Scanner cin = new Scanner(System.in);
        Salary = cin.nextInt();
        if (Salary <= 10000) {
            double DA = Salary * 80 / 100;
            System.out.println("DA " + DA);
            double HRA = Salary * 20 / 100;
            System.out.println("HRA " + HRA);
            double Total = DA + HRA + Salary;
            System.out.println("1st Total salary: " + Total);

        } else if (Salary <= 20000) {
            double DA = Salary * 90 / 100;
            System.out.println("DA " + DA);
            double HRA = Salary * 25 / 100;
            System.out.println("HRA " + HRA);
            double Total = DA + HRA + Salary;
            System.out.println("2nd Total salary: " + Total);

        } else if (Salary > 20000) {
            double DA = Salary * 95 / 100;
            System.out.println("DA " + DA);
            double HRA = Salary * 36 / 100;
            System.out.println("HRA " + HRA);
            double Total = DA + HRA + Salary;
            System.out.println(" 3rd Total salary: " + Total);

        }
    }
}
