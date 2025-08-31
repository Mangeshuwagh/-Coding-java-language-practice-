import java.util.Scanner;

public class newUseHashCode {

    public static void main(String[] args) {

        String name = new String("Mangesh Wagh");
        String Name = new String("Mangesh Wagh");
        System.out.println("Show the location of String using the new(): ");

        System.out.println(name + "****" + System.identityHashCode(name));
        System.out.println(name + "****" + System.identityHashCode(Name));
    }

}
