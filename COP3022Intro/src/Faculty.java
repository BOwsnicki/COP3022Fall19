
public class Faculty extends Person {
	private String uwfId;
	private String courseTaught;
	
	public Faculty(String name, int age, String uwfId, String courseTaught) {
		super(name,age);
		this.uwfId = uwfId;
		this.courseTaught = courseTaught;
	}
	
	public String getUwfId() {
		return uwfId;
	}
	
	public String getCourseTaught() {
		return courseTaught;
	}
	
}
