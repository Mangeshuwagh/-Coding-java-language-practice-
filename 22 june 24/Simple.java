import java.util.Scanner;
 
 public class Simple
 {
  
  public static void main(String[] args)
  {
  
  
  Scanner sc = new Scanner(System.in);
  int P , T, R;
   
   
   System.out.println("Enter the Amaount: \n");
     P = sc.nextInt();
	 System.out.println("Enter the Time: \n");
	  T = sc.nextInt();
	   System.out.println("Enter the Rate: \n");
	    R = sc.nextInt();
		
		
		float SI = (R*T*P)/100;
		
		
		System.out.println("Simple intress : \n"+SI);
   sc.close();
  
  }
  
  
  
  
  }