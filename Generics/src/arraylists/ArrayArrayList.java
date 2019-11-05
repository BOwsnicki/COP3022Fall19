package arraylists;

import java.util.ArrayList;

public class ArrayArrayList {
	private static final int CAPACITY = 5;
	
	public static void main(String[] args) {
		
		String[] namesArray = new String[CAPACITY];
		namesArray[0] = "Helga";
		namesArray[1] = "Hagar";
		namesArray[2] = "Freya";
		namesArray[3] = "Odin";
		namesArray[4] = "Leia";
		namesArray[5] = "Luke"; // fails!
		
		ArrayList<String> namesArrayList = new ArrayList<>();
		namesArrayList.add("Helga");
		namesArrayList.add("Hagar");
		namesArrayList.add("Freya");
		namesArrayList.add("Odin");
		namesArrayList.add("Leia");
		namesArrayList.add("Luke"); // Works
		
		for(String s : namesArrayList) {
			System.out.println(s);
		}
	}
}
