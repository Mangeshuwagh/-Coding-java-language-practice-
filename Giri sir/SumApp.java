
import java.util.Scanner;
 class Sum{
 private int Sum=0;
 private int a[];
 
    Sum(int a[])
     {
 this.a=a;
     }
  public int GetSum()
  {
    for(int i=0;i<a.length;i++)
	{
		
		Sum+=a[i];
	}
	return Sum;
  }
 
 }
 public class SumApp{
 
    public static void main(String []args)
	  {
	  
	  int a[]=new int[5];
	  Scanner cin = new Scanner(System.in);
	  System.out.print("Enter the five Elements in the array");
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=cin.nextInt();
	  }
	  System.out.print("Enter the five Elements: \n");
	  Sum s= new Sum(a);
	  int result = s.GetSum();
	  System.out.print("Sum of Array: "+result );
	  
	  }
 
 }