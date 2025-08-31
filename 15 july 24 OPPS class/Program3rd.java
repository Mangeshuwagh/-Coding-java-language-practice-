// Q. WAP to create class name as Table with two methods 
// void setNum(int no): this method can accept number as parameter 
// void showTable(): this method can calculate table of number and display it

import java.util.Scanner;

class Table {
    int a;

    void setNum(int no) {
        a = no;

    }

    void showTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a * i);
        }
    }
}

public class Program3rd {

    public static void main(String[] args) {
        int b;
        Scanner cin = new Scanner(System.in);
        System.out.println("enter the number show the table: \n");
        b = cin.nextInt();
        Table t = new Table();
        t.setNum(b);
        t.showTable();
    }
}
