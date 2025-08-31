
// Q5. Write a java program to create a class name palindrome  as 
//  two method void SetValue(int no) and void checkpalindrome() 
//  and whether number is palindrome or not.

import java.util.Scanner;

class palindrome {
    int no;

    void SetValue(int n) {
        no = n;
    }

    void checkpalindrome() {
        int temp = no;
        int rev = 0, rem = 0;
        while (no != 0) {

            rem = no % 10;
            rev = rev * 10 + rem;
            no /= 10;
        }
        if (rev == temp) {
            System.out.println("Number is Pallindrom: \n " + rev);

        } else {
            System.out.println("Number is not palindrom: \n " + temp);
        }

    }
}

public class Program5th {
    public static void main(String[] args) {
        int number;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the numbers : and check thise number palindrom or not: \n");
        number = cin.nextInt();

        palindrome p = new palindrome();

        p.SetValue(number);
        p.checkpalindrome();
    }
}
