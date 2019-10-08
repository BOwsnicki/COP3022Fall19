
public class Reader2a {
	public static void main(String[] args) {
		String input1 = "33";
		String input2 = "3x";

		try {
			int i1 = Integer.parseInt(input2);
			System.out.println(i1);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
