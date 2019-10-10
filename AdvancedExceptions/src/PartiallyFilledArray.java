import java.util.Scanner;

public class PartiallyFilledArray {

	private static final int MAX_ENTRIES = 5;

	private String[] entries;
	private int numberOfEntries;

	public PartiallyFilledArray() {
		entries = new String[MAX_ENTRIES];
		numberOfEntries = 0;
	}

	public void addEntry(String entry) {
		// entries[numberOfEntries++] = entry;
		entries[numberOfEntries++] = cleanEntry(entry);
	}

	public String cleanEntry(String entry) {
		String result = "";
		for (int i = 0; i <= entry.length(); i++) {
			char c = entry.charAt(i);
			if (c >= 'a' && c <= 'z') {
				result += c;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		try {
			PartiallyFilledArray pfa = new PartiallyFilledArray();
			pfa.addEntry("String 1");
			pfa.addEntry("String 2");
			pfa.addEntry("String 3");
			pfa.addEntry("String 4");
			pfa.addEntry("String 5");
			pfa.addEntry("String 6");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ooops");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("WRONG!!!");
		}
	}
}
