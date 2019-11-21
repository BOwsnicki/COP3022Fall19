
public class RecursionDemo2 {

	public static int power(int x, int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Negative exponent!");
		}
		if (n == 0) {
			return 1;
		} else {
			return x * power(x, n - 1);
		}
	}

	public static int fastPower(int x, int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Negative exponent!");
		}
		if (n == 0) {
			return 1;
		} else {
			if (n == 1) {
				return x;
			} else {
				if (n % 2 == 0) { // exponent is even
					return fastPower(x * x, n / 2);
				} else { // exponent is odd
					return x * fastPower(x * x, (n - 1) / 2);
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(fastPower(3, 4));
	}
}
