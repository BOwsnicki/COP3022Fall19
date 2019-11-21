
public class RecursionDemo1 {
	public static void writeVertical(int n) {
		if (n < 10) {
			System.out.println(n);
		} else {
			writeVertical(n / 10);
			System.out.println(n % 10);
		}
	}

	public static void writeVerticalInfinite(int n) {
		writeVerticalInfinite(n / 10);
		System.out.println(n % 10);
	}

	public static void main(String[] args) {
		writeVertical(2019);
		// writeVerticalInfinite(2018);
	}
}
