package v4;

import java.util.Arrays;
import static java.util.Comparator.comparing;

public class SortDemo2 {
	// Nah! We don't actually need Comparable :-)
	// And we don't need loops either!
	public static void main(String[] args) {
			Measurable[] stuff = {
					new TV(1900),
					new TV(1600),
					new Employee(2000),
					new TV(1500),
					new Employee(1400)
					};
			Arrays.sort(stuff,comparing((x) -> x.getMeasure()));
			Arrays.stream(stuff).forEach(System.out::println);
	}
}
