package arraylistsAdvanced;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListVersionSort {

	public static void main(String[] args) {
		ArrayList<Measurable> stuff = new ArrayList<>();
		stuff.add(new TV(1900));
		stuff.add(new TV(1600));
		stuff.add(new Employee(2000));
		stuff.add(new TV(1300));
		stuff.add(new Employee(1400));
		
		Collections.sort(stuff, new MeasurableComparer());
		for (Measurable m: stuff) {
			System.out.println(m);
		}
	}
}
