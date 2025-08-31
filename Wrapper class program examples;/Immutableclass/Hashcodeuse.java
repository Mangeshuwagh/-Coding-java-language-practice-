
import java.util.Scanner;

public class Hashcodeuse {

    public static void main(String[] args) {

        String name = "Mangesh Wagh";
        String Name = "Mangesh Wagh";

        System.out.println("Memory Location is same: ");
        System.out.println("Show 1st the output is : " + name + "**" + System.identityHashCode(name) + "\n");

        System.out.println("Show 2nd the output is : " + Name + "***" + System.identityHashCode(Name));
    }

}
