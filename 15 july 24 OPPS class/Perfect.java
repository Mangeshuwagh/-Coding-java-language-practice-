
// Q. WAP to create class name as Perfect with two functions 
// void setNum(int no): this function accept number as parameter 
// void calPer(): this method can check number is perfect or not 

import java.util.*;

class Perfect2 {
    int No;

    void setNum(int no) {
        No = no;

    }

    void calPer() {
        int temp = No;
        // int bs = 0;
        int result = 0;
        for (int i = 1; i <= No / 2; i++) {

            // bs += i;
            if (No % i == 0) {

                // No = No / 2;
                result += i;
            }

        }
        System.out.println("Number is Perfect: \n" + result);
        if (result == No) {
            System.out.println("Number is Perfect: \n" + result);

        } else {
            System.out.println("Number is not Perfect: \n" + No);
        }

    }

}

public class Perfect {

    public static void main(String[] args) {

        int no;
        System.out.println("Ente the number: \n");
        Scanner cin = new Scanner(System.in);
        no = cin.nextInt();
        Perfect2 p = new Perfect2();
        p.setNum(no);
        p.calPer();
    }
}
