import java.util.Scanner;

public class Equality2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = "Hello, world!";
		System.out.print("> ");
		String s2 = input.nextLine();
			
		// Equality 1
		System.out.println(s1 == s2);		
		
		// Equality 2
		System.out.println(s1.equals(s2));
		
		
		input.close();
	}
}
