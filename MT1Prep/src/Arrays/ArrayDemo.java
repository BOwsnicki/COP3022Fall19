package Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		Person[] people = new Person[3];
		
		people[0] = new Person("Hugo",34);
		// people[1] = new Person("Helga",35);
		people[2] = new Person("Hagar",74);
		
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i].getAge());
		}
			
		
	}
}
