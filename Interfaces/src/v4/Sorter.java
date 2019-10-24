package v4;

public class Sorter {
	public static void selectionSort(Comparable[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[index]) < 0) {
					index = j; // searching for lowest index
				}
			}
			Comparable smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}
}
