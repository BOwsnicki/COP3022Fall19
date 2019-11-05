package generics;

public class StackTest {
	public static void main(String[] args) {
		String[] stringElements = { "One", "Two", "Three", "Four", "Five" };
		int[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Stack<String> stringStack = new Stack<>();
		Stack<Integer> integerStack = new Stack<>();

		for (int i = 0; i < stringElements.length; i++) {
			stringStack.push(stringElements[i]);
		}

		while (!stringStack.isEmpty()) {
			System.out.println(stringStack.pop());
		}
		
		for (int i = 0; i < integerElements.length; i++) {
			integerStack.push(integerElements[i]);
		}

		while (!integerStack.isEmpty()) {
			System.out.println(integerStack.pop());
		}
	}
}

/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/