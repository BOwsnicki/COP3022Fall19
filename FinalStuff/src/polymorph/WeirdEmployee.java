package polymorph;

public class WeirdEmployee extends Employee {
	@Override
	public String toString() {
		return "GoooGoooGooo!!!";
	}
	
	public static void main(String[] args) {
		Employee e = new WeirdEmployee();
		System.out.println(e);
	}
}
