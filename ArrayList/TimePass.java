import java.util.*;

public class TimePass {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        Scanner cin = new Scanner(System.in);
        System.out.println("how many integers you want Add enter him: ");

        int limit = cin.nextInt();

        for (int i = 0; i < limit; i++) {
            al.add(cin.nextInt());
        }
        System.out.println(" show the all interger in the list: \n\n" + al);

        // get the number in the arraylist ;

        try {
            System.out.println("Which index  number you want : ");
            int nn = cin.nextInt();
            Object number = al.get(nn);
            if (number != null) {
                System.out.println("Find the Numbers: " + number);

            } else {
                System.out.println("not found: ");

            }
        } catch (Exception ex) {
            System.out.println(" error is " + ex);

        }

        System.out.println("Set the number in the List : and enter the index nd number: ");
        System.out.println("Number : ");
        int nu = cin.nextInt();
        System.out.println("Enetr the index");
        int indxx = cin.nextInt();
        al.add(indxx, nu);
        System.out.println(" ..............\n" + al);

        System.out.println("Search elements : ");
        int num = cin.nextInt();
        int nn = al.indexOf(num);

        if (nu != -1) {
            System.out.println("Number is found ");

        } else {
            System.out.println("bnumber is not found ");
        }

    }
}
