
public class StringUtil {
	public static void scanString(String s) throws NoDigitException {
		// Must have one digit in it
		// else a NoDigitException is thrown
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') return;
		}
		throw new NoDigitException();
	}
}
