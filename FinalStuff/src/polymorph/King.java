package polymorph;

public class King extends Nobility {
	public void print() {
		super.print();
		System.out.println("I am a king");
	}

	public static void main(String[] args) {
		Person p = new King();
		p.print();
	}
}
