import java.io.*;
 import java.util.Scanner;
 
 public class Create {
	 public static void main(String []args) throws IOException
	 {
		 Scanner cin = new Scanner(System.in);
		 File file = new File("D:\\Java program  all\\StreamProgram\\NewFileMangesh");
		  
		 boolean check = file.exists();
		 if(check)
		 {
			 System.out.println("File already Craeted : ");
		 }
		 else{
			
			   
			   boolean b= file.mkdir();
			   
			   if(b)
			   {
				   System.out.println("File is Craeted: ");
				   File f= new File("D:\\Java program  all\\StreamProgram\\NewFileMangesh\\ Mangesh Wagh.doc");
	                  boolean d=f.createNewFile();
	                       if(d)
	                         { System.out.println("File created successfully............");
	                           }
                      	   else
	 

 { System.out.println("Some problem is there..............");
	   }	

			   }
			   else{
				   System.out.println("Some isuee you can check it: ");
				   return ;
			   }
			   
		 }
		  
		  
	 }
 }