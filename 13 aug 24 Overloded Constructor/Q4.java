import java.util.*;
import java.lang.Math;
// Example: WAP to create class name as FindNArmstrong with constructor and function
// FindNArmstrong(int limit): you have to accept integer as parameter 
// void showAllNumbersBetweenLimt(): find the all Armstrong numbers between limit 

// Expected output is 
// Input Limit: 11
// Output: 1   2   3   4   5   6   7  8   9
// Input Limt: 200
// Output: 1   2   3   4   5   6   7  8   9   153

class FindNArmstrong {
    private int Limt;

    FindNArmstrong(int Limit) {
        this.Limt = Limit;
    }

    public void showAllNumbersBetweenLimt() {

        for (int i = 1; i <= Limt; i++) {
            int num = i;
            int count = 0;
            int temp = num;
            while (num != 0) {
                int rem = num % 10;

                count++;
                num /= 10;
            }
            num = temp;
            int sum = 0;
            while (num != 0) {
                int rem = num % 10;
                sum += Math.pow(rem, count);
                num /= 10;
            }
            if (temp == sum) {
                System.out.print(" " + sum);
            }
        }
    }
}

public class Q4 {

    public static void main(String[] args) {
        int limit;
        System.out.println("Enter the limits : \n");
        Scanner cin = new Scanner(System.in);
        limit = cin.nextInt();
        FindNArmstrong F = new FindNArmstrong(limit);
        F.showAllNumbersBetweenLimt();

    }
}