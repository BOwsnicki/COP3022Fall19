package arraylistsAdvanced;
import java.util.ArrayList;

public class ArrayListVersion {
	public static Measurable min(ArrayList<Measurable> o) {
		Measurable smallest = o.get(0);
		for (int i = 1; i < o.size(); i++) {
			if (o.get(i).getMeasure() < smallest.getMeasure()) {
				smallest = o.get(i);
			}
		}
		return smallest;
	}
	
	public static void main(String[] args) {
		ArrayList<Measurable> stuff = new ArrayList<>();
		stuff.add(new TV(1900));
		stuff.add(new TV(1600));
		stuff.add(new Employee(2000));
		stuff.add(new TV(1300));
		stuff.add(new Employee(1400));
		
		Measurable smallest = min(stuff);
		System.out.println(smallest);
	}
}
