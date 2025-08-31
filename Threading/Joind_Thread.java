// Joind Thread

class A extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Class first: " + i);
				Thread.sleep(1000);
			}
		} catch (Exception ex) {
			System.out.println("Error is: " + ex);
		}
	}
}

class B extends Thread {

	public void run() {
		try {
			for (int i = 1; i <= 50; i++) {
				System.out.println("class b: " + i);
				Thread.sleep(100);
			}
		} catch (Exception ex) {
			System.out.println("Show the Error: " + ex);
		}
	}
}

public class Joind_Thread {

	public static void main(String[] args) {
		A a = new A();
		a.start();
		try {

			a.join();
		} catch (Exception ex) {
			System.out.println("Show the Errors : " + ex);
		}
		B b = new B();
		b.start();
	}
}
