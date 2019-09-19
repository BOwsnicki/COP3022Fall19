
public class Calculator {

	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int multiply(int n1, int n2) {
		int solution = n1*n2;
		if (n1 == n2) {	// YEAH, bit obvious!
			solution++;
		}
		return solution;
	}
}
