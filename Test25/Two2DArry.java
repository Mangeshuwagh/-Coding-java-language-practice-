
import java.util.Scanner;

public class Two2DArry{

 public static void main(String []args)

    {
	int a[][] = new int[3][3];
	
	Scanner cin = new Scanner(System.in);
	 
	 System.out.println("Enter the 2d array : ");
	  
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=0;j<a[i].length;j++)
		  {
			  a[i][j]=cin.nextInt();
		  }
	  }
	
	System.out.println("Show the array: ");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(" "+a[i][j]);
			
		}
		System.out.println();
	}
	int Search;
	 System.out.print("Enter the elements you search in the 3d array");
	  Search=cin.nextInt();
	  boolean flag = false;
	  int row=0;
	  int col=0;
	  for(int i=0;i<a.length;i++)
	  {
		  
		  for(int j=0;j<a[i].length;j++)
		  {
			  
			  
			  //condition ;
			  if(a[i][j]==Search)
			  {
				 row=i;
				 col=j;
				  
				  flag = true;
				 
				  //System.out.print(" its founds: "+j);
				  break;
				  
			  }
			  
			  
		  }
		  if(flag)
		  {
			  
			  break;
		  }
	  }
	  if(flag)
	  {  
            System.out.print("Shoe the value row No: "+row+"\ncolon index: "+col);
	  }
	  else{
		  System.out.println("Not found the value in  2d array:");
		  
	  }
	
}

}