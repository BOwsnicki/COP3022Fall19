package v3;

public abstract class ComparableMeasurable implements Comparable, Measurable {
	
	@Override
	public int compareTo(Object other) {
		if (other == null) {
			throw new NullPointerException();
		}
		if (!(other instanceof Measurable)) {
			throw new ClassCastException();
		}
		Measurable m = (Measurable) other;
		return (getMeasure() - m.getMeasure());
	}
}
