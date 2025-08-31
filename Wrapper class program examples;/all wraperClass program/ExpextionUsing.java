import java.util.Scanner;

public class ExpextionUsing {

    public static void main(String [] args) 
    {
         
        try
        {
            String number = "12345A";
             
            int a = Integer.parseInt(number);
             float f = Float.parseFloat(number);
               double d = Double.parseDouble(number);
                long  l = Long.parseLong(number);

                // coverted by the String to Intergers.
                 
                System.out.println("After converted by: int: "+a);
                System.out.println("After converted by: Float: "+f);
                System.out.println("After converted by: double: "+d);
                System.out.println("After converted by: long: "+l);
             
        }

    }

}
