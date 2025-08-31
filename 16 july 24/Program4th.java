// Sanjay Ghisadi
// 4:44 PM
// Q4.  Write a java program to create a class name  Reverse as  two method  void Setvalue(int no) and int getValue()  and print the number revese

// input :
// 123

// out put
// 321

import java.util.Scanner;

class Reverse {
    int no;

    void Setvalue(int n) {
        no = n;
    }

    int getValue() {
        int rev = 0, rem = 0;
        while (no != 0) {

            rem = no % 10;
            rev = rev * 10 + rem;
            no /= 10;
        }
        return rev;

    }
}

public class Program4th {
    public static void main(String[] args) {
        int no;
        System.out.println("Enter the numbers in the four digit: \n");
        Scanner cin = new Scanner(System.in);
        no = cin.nextInt();
        Reverse r = new Reverse();
        r.Setvalue(no);
        int revers = r.getValue();
        System.out.println("Revers the numbers : \n" + revers);

    }

}
