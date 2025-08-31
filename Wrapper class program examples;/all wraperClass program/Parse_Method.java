import java.util.Scanner;

public class Parse_Method {

    public static void main(String[] args) {

        // using the parseXXX();

        String Name = "123456";
        int a = Integer.parseInt(Name);
        float b = Float.parseFloat(Name);
        double d = Double.parseDouble(Name);

        System.out.println("Converted by Integers: " + a);
        System.out.println("Converted by Flaot: " + b);
        System.out.println("Converted by Double: " + d);

        // int a= Integer.parseInt(s);
        // float b=Float.parseFloat(s);
        // double d=Double.parseDouble(s);
        // System.out.println("integer a is "+a);
        // System.out.println("float b is "+b);
        // System.out.println("double d is "+d);

    }

}
