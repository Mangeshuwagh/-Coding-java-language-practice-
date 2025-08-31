// Method with Variable Argument

import java.util.Scanner;

class ArgMeth {

    private int sum = 0;
    // private String name;
    private String name;

    public void setValue(String ch, int... x) {
        System.out.println("Name: \t" + ch);
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        // this.name = ch;

    }

    void ShowSum() {
        System.out.println(" Sum of: \t" + sum);
    }
}

public class InnerArgMet {

    public static void main(String[] args) {

        ArgMeth s = new ArgMeth();
        int nume;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the numbers: \n");

        nume = cin.nextInt();
        String name;
        System.out.println("Enter the name: \n");
        cin.nextLine();
        name = cin.nextLine();
        int num1 = cin.nextInt();
        int num2 = cin.nextInt();
        int num3 = cin.nextInt();
        s.setValue(name, nume, num1, num2, num3);
        s.ShowSum();
    }

}