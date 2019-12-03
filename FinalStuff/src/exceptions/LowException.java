package exceptions;

public class LowException extends TopException {
	public LowException(String message) {
		super(message);
	}

	public static void main(String args[]) {
		try {
			// Code that throws a "LowException"
		} catch (TopException e) {
			System.out.println("Caught base class exception");
		} catch (LowException e) {
			System.out.println("Caught derived class exception");
		}
	}
}
