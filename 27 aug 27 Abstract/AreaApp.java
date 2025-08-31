import java.util.*;

abstract class Area {

	abstract void Show();

}

class circle extends Area {
	double r;

	void setradius(double r) {
		this.r = r;
	}

	void Show() {
		double result = r * r;
		System.out.println("Area of circle : " + result);
	}
}

class Recangle {
	double l, w;

	void setReacamgle(double l, double w) {
		this.l = l;
		this.w = w;
	}

	void Show() {
		double rr = Math.PI * l * w;
		System.out.println("circle of ReactAngle " + rr);
	}
}

public class AreaApp {

	public static void main(String[] args) {
		double r;
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		r = cin.nextDouble();
		circle c = new circle();
		c.setradius(r);
		c.Show();
		System.out.println("Enter the length and width : ");
		double l = cin.nextDouble();
		double w = cin.nextDouble();
		Recangle f = new Recangle();
		f.setReacamgle(l, w);
		f.Show();

	}

}