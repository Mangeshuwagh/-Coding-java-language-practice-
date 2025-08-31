import java.util.Scanner;

public class Auto_Boxing {

    public static void main(String[] args) {
        int a;
        Integer b;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the int Value: ");
        a = cin.nextInt();
        // assign the value in the long primitive data types:

        b = a;// thats called as Auto Boxing ;
        System.out.println("B Integers value is; " + b);

    }

}
