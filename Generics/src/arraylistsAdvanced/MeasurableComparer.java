package arraylistsAdvanced;
import java.util.Comparator;

public class MeasurableComparer implements Comparator<Measurable> {

	// Used for sorting in ascending order of measure
	// Result (as specified for Comparable/Comparator)
	//		negative:	a < b
	//		0:			a = b
	//		positive:	a > b
	public int compare(Measurable a, Measurable b) {
		return (a.getMeasure() - b.getMeasure());
	}
}
