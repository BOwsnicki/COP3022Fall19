package generics;

public class SampleTest {

	public static void main(String args[]) {
		Sample<String> object1 = new Sample<String>();
		object1.setData("Hello");
		System.out.println(object1.getData());

		Sample<Integer> object2 = new Sample<Integer>();
		object2.setData(10);
		System.out.println(object2.getData());
	}
}