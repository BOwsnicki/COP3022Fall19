package v4;

public interface ComparableMeasurable extends Comparable, Measurable {
	/*
	 * Yes, beginning with Java 8 Interfaces can have method implementations!
	 * 
	 * https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html
	 * 
	 * I shouldn't have told you that, I know!
	 * 
	 */
	default public int compareTo(Object other) {
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
