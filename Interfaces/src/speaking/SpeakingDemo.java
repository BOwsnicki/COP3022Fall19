package speaking;

public class SpeakingDemo {
	public static void main(String[] args ) {
		Speaking[] shelter = new Speaking[6];
		shelter[0] = new Cat();
		shelter[1] = new Cat();
		shelter[2] = new Dog();
		shelter[3] = new Cat();
		shelter[4] = new Bird();
		shelter[5] = new Dog();
		
		for (int i = 0; i < shelter.length; i++) {
			System.out.println(shelter[i].speak());
		}
	}
}
