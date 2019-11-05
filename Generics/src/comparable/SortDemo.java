package comparable;

import java.util.Arrays;

public class SortDemo {

	public static void main(String[] args) {
			Employee[] stuff = new Employee[5];
			stuff[0] = new Manager(1900,400);
			stuff[1] = new Employee(1600);
			stuff[2] = new Employee(2000);
			stuff[3] = new Manager(1500,700);
			stuff[4] = new Employee(1400);
			Arrays.sort(stuff); // uses Comparable!
			for (int i = 0; i < stuff.length; i++) {
				System.out.println(stuff[i]);
			}
	}

}
