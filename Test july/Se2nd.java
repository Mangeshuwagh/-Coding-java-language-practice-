
// 2)  Wirte a program to calculate sum of digits located in String. 
// Input – “Hello 123 world 456 java 987 program”. 
// Output – 1566
import java.util.Scanner;

public class Se2nd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String\n");

        String Store = input.nextLine();
        int numS = 0;
        for (int i = 0; i < Store.length(); i++) {
            if (Store.charAt(i) >= '0' && Store.charAt(i) <= '9') {
                numS = numS * 10 + (Store.charAt(i) - '0');

            }
        }

        System.out.print("Show the number: \n" + numS);
        int n1,n2,n3;
      for(int i=1;i<=3;i++)
      {
        int cout=3;
         while (cout!=0) {

            
         }
      }

    }
}