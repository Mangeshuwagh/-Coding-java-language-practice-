import java.util.Scanner;

public class ValueOfMethod {

    public static void main(String[] args) {

        int a = 10;

        // use the value of methods and convert any data type :

        // for exapmle :

        float f = Float.valueOf(a);
        Double d = Double.valueOf(a);
        long l = Long.valueOf(a);
        String s = String.valueOf(a);

        System.out.println(" Show the converted by Float: " + f);
        System.out.println(" Show the converted by Double: " + d);
        System.out.println(" Show the converted by Long:  " + l);
        System.out.println(" Show the converted by String :  " + l);
        // System.out.println("Types of: ");
        System.out.println(s + " is of type " + s.getClass().getSimpleName());
        // System.out.println(l + " is of type " + l.getClass().getSimpleName());
        System.out.println(l + " is of type " + l.getClass().getSimpleName());
        System.out.println(s + " is of type " + s.getClass().getSimpleName());
    }

}
