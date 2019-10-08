import java.util.Scanner;

public class Reader5 {
	private static final String password = "s3cr3t";
	
	public static boolean readPassword() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String input = inp.nextLine();
		try {
			StringUtil.scanString(input);
		} catch (NoDigitException e) {
			return false;
		} finally {
			System.out.println("Closing input...");
			inp.close();
		}
		return password.equals(input);
	}
	
	public static void main(String[] args) {
		System.out.println(readPassword());
	}
}
