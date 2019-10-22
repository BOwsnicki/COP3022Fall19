package v1;

public interface Ordered {
	public boolean precedes(Object other);
	public boolean follows(Object other);
}
