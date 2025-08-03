// Q6. Write Program to create abstract class name as Value with one abstract and one non abstract
// method
// void setValue(int ,int): this is non abstract method with two parameter
// abstract int getResult(): this is abstract method
// and you have two child class name as Power and you have to override getResult() method in Power
// class and calculate power of two values and return it as well as SearchDigit and you have to override
// getResult() consider first parameter of setValue() is number and second parameter is digit and you
// have to search digit in number and return it and if digit not found return -1

import java.util.*;

abstract class Value {
    protected int base, power;

    void setValue(int base, int power) {
        this.base = base;
        this.power = power;

    }

    abstract int getResult();
}

class Power extends Value {

    public int getResult() {

        int Sum = 1;
        for (int i = 1; i <= power; i++) {

            base *= power;
        }
        return base;

    }
}

class SearchDigit extends Value {

    public int getResult() {

        boolean check = false;
        while (base != 0) {
            int rem = base % 10;
            if (rem == power) {
                // return 1;
                check = true;
                break;

            }
            base /= 10;

        }
        if (check) {
            return 1;

        } else {
            return -1;
        }

    }

}

public class absct {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the two Numbers and we get the number of Powers ");

        int numb1 = cin.nextInt();
        System.out.println("Enter the Second number ");
        int numb2 = cin.nextInt();
        // System.out.println();

        Power p = new Power();
        p.setValue(numb1, numb2);
        System.out.println("Show the Power of the Numbers ");

        System.out.println(p.getResult());
        System.out.println("Enter the First Number for eg. 1234 same type ");

        numb1 = cin.nextInt();
        System.out.println(" enter the Seacrh number ");
        numb2 = cin.nextInt();
        SearchDigit sc = new SearchDigit();
        sc.setValue(numb1, numb2);
        if (sc.getResult() != -1) {
            System.out.println(" Number is Found ");

        } else {
            System.out.println("Number is  not Found");
        }
    }
}