package comparable;

public class Manager extends Employee {
	private int bonus;
	
	public Manager(int salary, int bonus) {
		super(salary);
		this.bonus = bonus;
	}
	
	@Override
	public int getSalary() {
		return super.getSalary() + bonus;
	}

}
