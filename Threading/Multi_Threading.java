// Multi Threadings 

// What is the Multi Threading ?
//Ans
//Multithreading enables us to run multiple threads concurrently. 
//For example in a web browser, we can have one thread which handles the user interface,
//and in parallel we can have another thread which fetches the data to be displayed

class A extends Thread {

	public void run() {

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Class A print Runs: " + i);
				Thread.sleep(1000);
				// its works means 10 second later its print .

			}

		} catch (Exception ex) {
			System.out.println("Show the Error of Expection: " + ex);

		}
	}
}

class B extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Class B print: " + i);
				Thread.sleep(1000);
				// its works on the 1 second print the i value.

			}

		} catch (Exception ex) {
			System.out.print("Show  the Error Expection: " + ex);
		}
	}
}

public class Multi_Threading {

	public static void main(String[] args) {
		A a = new A();
		// a.run();
		a.start();

		B b = new B();
		b.start();

	}
}