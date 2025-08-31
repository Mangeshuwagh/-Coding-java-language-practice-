import java.util.Scanner;

class A {
	
 final void show()
 {
	 
	 System.out.print("I am Class A");
 }
 
}

class B extends A
{
	 void Show()
	{
		
		System.out.print("I am Class B im child for Class Inheritance : ");
		
		
	}
	
}


 public class Simple{
  
  public static void main(String []args)
  {
  //System.out.print("Hello word i m future developer ");
  
  B b = new B();
  b.show();
  }
  
  }