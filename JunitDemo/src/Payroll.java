public class Payroll {
	
   // Calculate the yearly salary of employee
   
	public double calculateYearlySalary(Employee e) {
      double yearlySalary = 0;
      yearlySalary = e.getMonthlySalary() * 12;
      return yearlySalary;
   }
	
   // Calculate the bonus amount of employee
   public double calculateBonus(Employee e) {
      double bonus = 0;
		
      if(e.getMonthlySalary() < 10000){
    	  bonus = 500;
      }else{
    	  bonus = 1000;
      }
		
      return bonus;
   }
}