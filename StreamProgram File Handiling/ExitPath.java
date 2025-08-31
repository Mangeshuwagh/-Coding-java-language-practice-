import java.io.*;
 
 public class ExitPath{
	 
	 public static void main(String []args)
	 {
		 
		 File fe = new File("D:\\Java program  all\\IOStream all programs\\ newFileMangesh");
		   boolean check =fe.exists();
		    if(check){
				System.out.println("File already Create Bhau ");
				
			}
			else
			{
			  boolean cre = fe.mkdir();
if(cre)
{
	System.out.println("Folder is Created Brother : ");
}	else{
	
	System.out.println("Folder is not Created: ");
}
			}
	 }
 }