class P
{
   void setValue(int x)
  { System.out.println("I am P  "+x);
  }
}
class C extends P
{  public void setValue(int  x)
   { System.out.println("I am MA"+x);
   }
}
public class OverridingApp
{  public static void main(String x[])
	{   C c1 = new C();
		c1.setValue(10);
		 
	}
}
