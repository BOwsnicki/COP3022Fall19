package recursion;

public class Addup {
	public static int addup(int n) {
		if (n > 0) {
			return n + addup(n - 1);
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(addup(10));
		System.out.println(addup(-10));
	}
}
