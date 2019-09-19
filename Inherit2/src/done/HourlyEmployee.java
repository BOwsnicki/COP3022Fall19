package done;

public class HourlyEmployee extends Employee {

	private double hours;
	private double payPerHour;
	
	public HourlyEmployee(String name, double hours, double payPerHour) {
		super(name);
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
