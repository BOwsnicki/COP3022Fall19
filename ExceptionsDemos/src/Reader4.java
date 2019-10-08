import java.util.Scanner;

public class Reader4 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String input;
		boolean done;
		
		do {
			done = true;
			System.out.print("Enter a string with a digit: ");
			input = inp.nextLine();
			try {
				StringUtil.scanString(input);
			} catch (NoDigitException e) {
				System.out.println(e);
				done = false;
			}
		} while (!done);
		System.out.println("Thank you!");
		inp.close();
	}
}
