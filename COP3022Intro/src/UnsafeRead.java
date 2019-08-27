import java.util.Scanner;

public class UnsafeRead {
	
	public static int readInt(Scanner inp, String prompt) {
		System.out.print(prompt + " > ");
		return inp.nextInt();
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("You entered " + readInt(inp, "Enter a number"));
	}
}
