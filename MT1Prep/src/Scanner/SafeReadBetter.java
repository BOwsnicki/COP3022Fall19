package Scanner;
import java.util.Scanner;

public class SafeReadBetter {
	
	private static int readInt(Scanner inp, String prompt) {
		System.out.print(prompt + " > ");
		while (!inp.hasNextInt()) {
			inp.nextLine(); 		// read out whatever is on that line (flush the input)
			System.out.print(prompt + " > ");
		}
		return inp.nextInt();
	}
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("You entered " + readInt(inp,"Enter a number"));
	}
}
