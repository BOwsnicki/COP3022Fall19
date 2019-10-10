import java.util.Scanner;

public class Reader7 {
	public static int readNumber() {
		System.out.print("Enter a number: ");

		try (Scanner inp = new Scanner(System.in)) {// try with resources
			String input = inp.nextLine();
			StringUtil.scanString(input);
			return Integer.parseInt(input);
		} catch (NoDigitException e) {
			System.out.println("Should have a digit");
			return 4711;
		} catch (NumberFormatException e) {
			System.out.println("Not a number");
			return -4711;
		}
	}

	public static void main(String[] args) {
		System.out.println(readNumber());
	}
}
