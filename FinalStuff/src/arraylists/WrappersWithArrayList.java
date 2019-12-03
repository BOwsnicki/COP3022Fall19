package arraylists;

import java.util.ArrayList;

public class WrappersWithArrayList {
	private ArrayList<Integer> numbers;
	
	public WrappersWithArrayList() {
		numbers = new ArrayList<>();
	}
	
	public void add(int x) {
		numbers.add(x);
	}
	
	public void showAll() {
		for (int n : numbers) {
			System.out.print(n + " ");
		}
	}
	
}
