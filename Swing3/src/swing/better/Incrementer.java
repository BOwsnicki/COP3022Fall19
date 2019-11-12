package swing.better;

public class Incrementer {
	int count;

	public Incrementer() {
		count = 0;
	}

	public int incrementBy(int incr) {
		count += incr;
		return count;
	}
}
