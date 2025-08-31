
public class Employee implements Comparable {

	private int id, sal;
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSal() {
		return sal;
	}

	public Employee() {

	}

	public Employee(int id, int sal, String name) {
		this.sal = sal;
		this.id = id;
		this.name = name;
	}
	// @Override
	// public int compareTo(Object o) {
	// Employee e=(Employee)o;

	// if(this.getId()>e.getId()) {
	// return 1;
	// }
	// else if(this.getId()<e.getId()) {
	// return -1;
	// }
	// else {
	// return 0;
	// }
	// }
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if (this.getId() > e.getId()) {
			return 1;
		} else if (this.getId() < e.getId()) {
			return -1;
		} else {
			return 0;
		}
	}

}