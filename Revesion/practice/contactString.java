import java.util.Scanner;
// import java.util.Scanner;
 
public class contactString {

    
    public static void main(String [] args) 
    { 
        String first, second;
         
        Scanner cin = new Scanner(Syetem.in);
         System.out.println("Enter the first String: ");

         first = cin.nextLine();
         System.out.println("Enter the second String: ");
         second = cin.nextLine();
          
         // contact : 
         int fleng= first.length();
          int sleng= second.length();
            int total = fleng+sleng;

         char ch[]= new char[total];

         int k =0;
           for(int i=0;i<fleng;i++)
           {
             ch[k]=first.charAt(i);
             k++;
           }
           for(int i =0;i<sleng;i++)
           {
             ch[k]=second.charAt(i);
           }
   



    }
    
}