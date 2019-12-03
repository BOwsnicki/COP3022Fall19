package arraylists;

public class WrappersWithArray {
	private static final int MAX = 10;
	private int[] numbers;
	private int occupied;
	
	public WrappersWithArray() {
		numbers = new int[MAX];
		occupied = 0;
	}
	
	public void add(int x) {
		numbers[occupied++] = x;
	}
	
	public void showAll() {
		for (int i = 0; i < occupied; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
}
