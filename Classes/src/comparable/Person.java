package comparable;

public class Person {
	private String name;
	private int age;
	
	
	// Add equals methods
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (age != other.age) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	// 2. Constructor
	// A Constructor initializes ALL instance fields
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 3. get/set methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	// 4. derived methods
	public boolean canVote() {
		return (age >= 18);
	}
	

	
}
