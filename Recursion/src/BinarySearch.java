import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
	private final static Random rand = new Random();
	
	private static int search(int[] a, int first, int last, int key) {
		if (first > last) {
			return -1;
		} else {
			int mid = (first + last)/2;
			if (key == a[mid]) {
				return mid;
			} else if (key < a[mid]) {
				return search(a, first, mid-1, key);
			} else {
				return search(a, mid+1, last, key);
			}
		}
	}
	
	public static int search(int[] a, int key) {
		return search(a,0,a.length-1,key);
	}
	
	private static int getRandomVal(int min, int max) {
	    return min + rand.nextInt(max - min + 1);
	}
	
	private static int[] createRandomSortedArray(int number, int min, int max) {
		int[] data = new int[number];
		for (int i = 0; i < number; i++) {
			data[i] = getRandomVal(min,max);
		}
		Arrays.sort(data);
		return data;
	}

	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] data = createRandomSortedArray(20,0,500);
		printArray(data);
		System.out.print("> ");
		Scanner inp = new Scanner(System.in);
		int key = inp.nextInt();
		System.out.println(search(data,key));
	}
}
