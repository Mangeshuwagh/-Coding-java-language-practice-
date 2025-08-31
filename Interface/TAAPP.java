interface T
{ float PI = 3.13f; 
  void show(); //public abstract void show(); internally 
}
class TA implements T
{
	  public void show()
	  { System.out.println("I am show method of TA");
	  }
}
public class TAAPP
{
	  public static void main(String x[])
	  {
		    TA t = new TA();
			t.show();
	  }
}
