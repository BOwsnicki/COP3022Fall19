package Scanner;
import java.util.Scanner; 	// import statement for the Scanner class
							// Necessary because it's not part of Java Core
							// String (a class) is in the core so no import!

public class SimpleRead {	// Java: Everything needs to be in a class
	
	// This is a normal method/function
	// It shouldn't be accessible from outside the class: private
	// It works without having to create a class instance: static
	// It returns something of type String
	// It's called readString
	// It takes two parameters:
	//    1. The Scanner from which to read: inp
	//    2. A raw prompt - embellished by spaces and the prompt character: prompt
	//
	private static String readString(Scanner inp, String prompt) {
		System.out.print(prompt + " > ");
		return inp.nextLine();	// Scanner method: reads everything from the input to EOL
	}
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in); 	// create a local Scanner object 
												// which reads from the keyboard
		
		// You can do the next "the long way around", of course:
		// String input = readString(inp,"Enter your name");
		// System.out.println("Hello, " + input);
		
		System.out.println("Hello, " + readString(inp,"Enter your name"));
	}
}
