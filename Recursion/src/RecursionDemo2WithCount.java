
public class RecursionDemo2WithCount {
	private static int multCount;
	
	public static int power(int x, int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Negative exponent!");
		}
		if (n == 0) {
			return 1;
		} else {
			multCount++;
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
					multCount++;
					return fastPower(x * x, n / 2);
				} else { // exponent is odd
					multCount += 2;
					return x * fastPower(x * x, (n - 1) / 2);
				}
			}
		}
	}

	public static void main(String[] args) {
		multCount = 0;
		System.out.println(power(2, 20));
		System.out.println(multCount);
	}
}
