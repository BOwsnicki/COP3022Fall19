import java.util.Scanner;

public class Reader6 {
	public static int readNumber() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a number: ");
		try {
			String input = inp.nextLine();
			StringUtil.scanString(input);
			return Integer.parseInt(input);
		} catch (NoDigitException e) {
			System.out.println("Should have a digit");
			return 4711;
		} catch (NumberFormatException e) {
			System.out.println("Not a number");
			return -4711;
		} finally {
			System.out.println("Closing input...");
			inp.close();
		}
	}

	public static void main(String[] args) {
		System.out.println(readNumber());
	}
}
