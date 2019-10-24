package v2;

public class MeasuredDemo {

	public static void main(String[] args) {
		Measurable m1 = new TV(900);
		Measurable m2 = new Employee(1900);
		System.out.println(m1.getMeasure());
		System.out.println(m2.getMeasure());
	}

}
