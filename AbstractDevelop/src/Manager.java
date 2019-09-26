
public class Manager extends SalariedEmployee {
	private double bonus;
	
	public Manager() {
		this(null, 0.0, 0.0);
	}
	
	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double computeSalary() {
		return super.computeSalary() + bonus;
	}
	
	@Override
	public String toString() {
		return super.toString() + " bonus: " + bonus;
	}
}
