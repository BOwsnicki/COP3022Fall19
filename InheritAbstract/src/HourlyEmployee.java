
public class HourlyEmployee extends Employee {

	private double hours;
	private double payPerHour;
	
	public HourlyEmployee(String name) {
		super(name);
	}

	public HourlyEmployee(String name, double hours, double payPerHour) {
		this(name);
		this.hours = hours;
		this.payPerHour = payPerHour;
	}
	
	@Override
	public double computeSalary() {
		return hours*payPerHour;
	}
	
	public String toString() {
		return super.toString() + " hours: " + hours + " pay/h: " + payPerHour;
	}
}
