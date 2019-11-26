/*
 Syllables per line in Tool: "Lateralus"

 1 Black
 1 then
 2 white are 
 3 all I see 
 5 in my infancy
 8 Red and yellow then came to be, 
 5 reaching out to me
 3 Lets me see

13 As below, so above and beyond, I imagine
 8 Drawn beyond the lines of reason
 5 Push the envelope, 
 3 watch it bend
 */

public class Fibonacci {
	public static int fib(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return fib(n - 2) + fib(n - 1);
		}
	}

	public static int fibIter(int n) {
		if (n <= 1) {
			return 1;
		} else {
			int prev = 1;
			int current = 1;
			for (int i = 1; i < n; i++) {
				int tmp = current;
				current += prev;
				prev = tmp;
			}
			return current;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			System.out.println(fib(i));
			System.out.println(fibIter(i));
		}
	}
}
