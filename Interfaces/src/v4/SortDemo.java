package v4;

import java.util.Arrays;

public class SortDemo {

	public static void main(String[] args) {
			Comparable[] stuff = new Comparable[5];
			stuff[0] = new TV(1900);
			stuff[1] = new TV(1600);
			stuff[2] = new Employee(2000);
			stuff[3] = new TV(1500);
			stuff[4] = new Employee(1400);
			Arrays.sort(stuff); // uses Comparable!
			for (int i = 0; i < stuff.length; i++) {
				System.out.println(stuff[i]);
			}
	}

}
