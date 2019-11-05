package generics;

import java.util.ArrayList;

public class Stack<T> {
	private ArrayList<T> elements;

	public Stack() {
		this(10); // default stack size
	} // end no-argument Stack constructor

	public Stack(int capacity) {
		int initCapacity = capacity > 0 ? capacity : 10;
		elements = new ArrayList<T>(initCapacity);
	}

	public void push(T pushValue) {
		elements.add(pushValue);
	}

	public T pop() {
		if (elements.isEmpty())
			throw new EmptyStackException("Stack is empty, cannot pop");

		return elements.remove(elements.size() - 1);
	}
	
	public boolean isEmpty() {
		return elements.isEmpty();
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