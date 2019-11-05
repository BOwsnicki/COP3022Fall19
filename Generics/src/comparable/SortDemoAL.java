package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemoAL {

	public static void main(String[] args) {
		ArrayList<Employee> stuff = new ArrayList<>();
		stuff.add(new Manager(1900, 400));
		stuff.add(new Employee(1600));
		stuff.add(new Employee(2000));
		stuff.add(new Manager(1500, 700));
		stuff.add(new Employee(1400));
		Collections.sort(stuff); // uses Comparable!
		for (Employee e : stuff) {
			System.out.println(e);
		}
	}

}
