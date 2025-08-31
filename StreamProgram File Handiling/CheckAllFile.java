import java.io.*;
public class CheckAllFile{
	
	public static void main(String[]args)
	{
		File f = new File("D:\\Java program  all\\IOStream all programs");
		
		File list[]= f.listFiles();
		
		for(int i =0;i<list.length;i++)
		{
			if(list[i].isDirectory()){
				System.out.println(list[i]);
			}
		//System.out.println(list[i]);
		}
	}
}