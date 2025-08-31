// simple program threading 

class A extends Thread
{
   public void run()
   {
      try
	  {
	      for(int i=1; i<=5; i++)
		  {
		    System.out.printf("First Thread is %d\n",i);
			//Thread(10000);
			 Thread.sleep(1000);// its here start the Thresd some second its loop work slowly 
			 // 1000 per second 
			 // 10000// 10 second later he will be start 
			 
			
		  }
	  }
	  catch(Exception ex)
	  { System.out.println("Error is "+ex);
	  }
   }
}

public class SimpleProgram{
	
	public static void main(String []args)
	{
		
		A a = new A();
		 a.run();
	}
}