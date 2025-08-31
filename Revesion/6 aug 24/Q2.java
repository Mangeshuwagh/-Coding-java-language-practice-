// 12.Write a C program to input month number and print number of days in that month.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter the month and print the days");
        char ch;
        do {
            System.out.println(
                    "1 = jan\n 2 = feb,\n 3 = march,\n 4 = April, \n 5 = May , \n 6 = June, \n 7 = Jully , \n 8 = Augest, \n 9 = Saptember, \n 10 = Octomber, \n 11 = Novmber,\n 12 = December\n");
            System.out.println("Enter the u=your choice: \n");

            Scanner cin = new Scanner(System.in);

            int choice = cin.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(" 31 Day");
                    break;
                case 2:
                    System.out.println(" 29/ 28  Day");
                    break;
                case 3:
                    System.out.println(" 31 Day");
                    break;
                case 4:
                    System.out.println(" 30 Day");
                    break;
                case 5:
                    System.out.println(" 31 Day");
                    break;
                case 6:
                    System.out.println(" 30 Day");
                    break;
                case 7:
                    System.out.println(" 31 Day");
                    break;
                case 8:
                    System.out.println(" 31 Day");
                    break;
                case 9:
                    System.out.println(" 30 Day");
                    break;
                case 10:
                    System.out.println(" 31 Day");
                    break;
                case 11:
                    System.out.println(" 30 Day");
                    break;
                case 12:
                    System.out.println(" 31 Day   \n Party Month");
                    break;

                default:
                    System.out.println("You enter the wrong the month");
                    break;
            }
            System.out.println("You want Contuinue so press the y");
            ch = cin.next().charAt(0);
            // ch = 111;

        } while (ch == 'y' || ch == 'Y');
    }

}
