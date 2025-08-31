// 11.Write a C program to input week number and print week day.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        System.out.println("1,2,3,4 Enter the Weak means your choice");
        int choice;
        Scanner cin = new Scanner(System.in);
        choice = cin.nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    System.out.println(" " + i);
                }

                break;
            case 2:
                for (int i = 8; i <= 14; i++) {
                    System.out.println(" " + i);
                }
                break;
            case 3:
                for (int i = 15; i <= 21; i++) {
                    System.out.println(" " + i);
                }
                break;
            case 4:
                for (int i = 22; i <= 28; i++) {
                    System.out.println(" " + i);
                }
                break;
            default:
                System.out.println(" you choice the wrong the choice : ");
                break;
        }
    }
}