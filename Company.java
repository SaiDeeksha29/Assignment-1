package employee;

public class Company {
	// TODO Auto-generated constructor stub\
	
	// static variables
	public static final int IS_PART_TIME = 2;
	public static final int IS_FULL_TIME = 1;
	private int empWagePerHour;
	private int workDaysPerMonth;
	private int workHoursPerMonth;

	public Company(int empWagePerHour, int workDaysPerMonth, int workHoursPerMonth) {
		this.empWagePerHour = empWagePerHour;
		this.workDaysPerMonth = workDaysPerMonth;
		this.workHoursPerMonth = workHoursPerMonth;
	}

	public int EmpWage() {
		// variables
		int empWage = 0;
		int dayCount = 0;
		int hoursWorked = 0;
		int totalWage = 0;
		int empHour = 0;

		// Computation
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

		switch (empCheck) {
		case 1:
			empCheck = IS_FULL_TIME;
			System.out.println("Employee Present - FULL TIME");
			empHour = 8;
			break;
		case 2:
			empCheck = IS_PART_TIME;
			System.out.println("Employee Present - PART TIME");
			empHour = 4;
			break;
		default:
			System.out.println("Employee is Absent");
			break;
		}

		// Calculation of Daily Employee Wage
		empWage = empHour * empWagePerHour;

		// Tabular Display of Employee Details for Maximum Monthly Hours or Days
		System.out.println("Day\tHours Worked\tTotal Wage");

		while ((hoursWorked + empHour) <= workHoursPerMonth && dayCount < workDaysPerMonth) {
			dayCount++;
			hoursWorked += empHour;
			totalWage += empWage;
			System.out.println(" " + dayCount + "  \t" + hoursWorked + "  \t\t" + totalWage);

		}

		// Calculations of Employee Wage for Hours left out of Maximum Hours
		if (hoursWorked < workHoursPerMonth && dayCount < workDaysPerMonth) {
			dayCount++;
			totalWage += (workHoursPerMonth - hoursWorked) * empWagePerHour;
			hoursWorked = hoursWorked + (workHoursPerMonth - hoursWorked);
			System.out.println(" " + dayCount + "  \t" + hoursWorked + "  \t\t" + totalWage);
		}
		return totalWage;
	}

}