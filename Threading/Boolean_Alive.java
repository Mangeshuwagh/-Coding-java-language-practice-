
class First extends Thread {

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Class first: " + i);
				Thread.sleep(1000);
				if (i == 3) {
					stop();
				}
			}
		} catch (Exception ex) {
			System.out.println("Error is " + ex);

		}
	}

	class Second extends Thread {

		public void run() {
			try {
				for (int i = 1; i <= 50; i++) {

					System.out.println("Second class: " + i);
					Thread.sleep(1000);
				}

			} catch (Exception ex) {
				System.out.println("Error is " + ex);
			}

		}
	}

	public class Boolean_Alive {

		public static void main(String[] args) {
			First f = new First();
			f.start();
			try {
				f.join();
			} catch (Exception ex) {
				System.out.println("Error is: " + ex);
			}

			System.out.println("Show the aline is: " + f.isAlive());

			Second s = new Second();
			s.start();
		}
	}
}