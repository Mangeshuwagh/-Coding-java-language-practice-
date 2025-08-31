import java.util.Scanner;
 class Power{
 
 private int p,b;
 private int result;
 
   Power(int Po, int Ba)
   {
   p=Po;
   b=Ba;
   
   }
   public int GetPower()
   {
	   result =1;
	   for(int i=1;i<=p;i++)
	   {
		   result=result*b;
	   }
	   
	   return result;
	   
   }
 }
 public class PowerApp{
        public static void main(String []args)
		{
		
		Power p= new Power(3,5);
	System.out.print(" power : "+p.GetPower());
		
		
		}
 
 
 }