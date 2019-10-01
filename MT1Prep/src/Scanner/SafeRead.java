package Scanner;
import java.util.Scanner;

public class SafeRead {
	
	private static int readInt(Scanner inp, String prompt) {
		System.out.print(prompt + " > ");
		if (inp.hasNextInt()) {
			return inp.nextInt();
		} else {
			return -1; // terrible for so many reasons
		}
	}
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("You entered " + readInt(inp,"Enter a number"));
	}
}
