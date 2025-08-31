import.java.util.Scanner;

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
	  search=cin.nextInt();
	  int flag=0;
	  int index;
	  for(int i=0;i<a.length;i++)
	  {
		  
		  for(int j=0;j<a[i].length;j++)
		  {
			  flag =0;
			  
			  //condition ;
			  if(a[j]==search)
			  {
				 index= j;
				  System.out.print(" its founds: "+j);
				  flag =1;
				  break;
			  }
			  
			  
		  }
	  }
	  if(flag==1)
	  {  
            System.out.print("Shoe the valur index"+ index)
	  }
	  else{
		  System.out.println("Not found the value in  2d array:");
		  
	  }
	
}

}