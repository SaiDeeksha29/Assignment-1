/**
 * 
 */
package employee;

/**
 * @author saideeksha
 *
 */
public class Employee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Welcome Message
		System.out.println("Welcome to Employee Wage Computation");
		
		int empWagePerHour=0;
		int workDaysPerMonth=0;
		int workHoursPerMonth=0;
		
		int company = (int) (Math.floor(Math.random() * 10) % 3);

		switch (company) {
		case 0:
			System.out.println("Company A");
			empWagePerHour = 20;
			workDaysPerMonth = 15;
			workHoursPerMonth = 100;
			break;
		case 1:
			System.out.println("Company B");
			empWagePerHour = 25;
			workDaysPerMonth = 20;
			workHoursPerMonth = 90;
			break;
		case 2:
			System.out.println("Company C");
			empWagePerHour = 15;
			workDaysPerMonth = 25;
			workHoursPerMonth = 120;
		}

		Company obj = new Company(empWagePerHour,workDaysPerMonth,workHoursPerMonth);
		int Total = obj.EmpWage();

		// Display of Employee Total Wage
		System.out.println("The Employee Total Wage for Maximum Hours or Days : " + Total);

	}
}