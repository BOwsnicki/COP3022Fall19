package v4;

public interface ComparableMeasurable extends Comparable<Measurable>, Measurable {
	/*
	 * Yes, beginning with Java 8 Interfaces can have method implementations!
	 * https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html
	 * 
	 * I shouldn't have told you that, I know!
	 * 
	 * Also:	Comparable actually is a "generic" Interface
	 * 			Meaning you can restrict the "other" to a particular
	 * 				type - here of course we use "Measurable"
	 * 			That saves the casting nonsense
	 */
	default public int compareTo(Measurable other) {
		if (other == null) {	// we still have to check for null
			throw new NullPointerException();
		}
		return (getMeasure() - other.getMeasure());
	}
}
