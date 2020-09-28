package employee;

public class CompanyEmpWage {
	// TODO Auto-generated constructor stub\

	public final int empWagePerHour;
	public final int workDaysPerMonth;
	public final int workHoursPerMonth;
	public final String companyName;
	public int totalEmpWage;

	public CompanyEmpWage(int empWagePerHour, int workDaysPerMonth, int workHoursPerMonth, String companyName) {
		this.companyName = companyName;
		this.empWagePerHour = empWagePerHour;
		this.workDaysPerMonth = workDaysPerMonth;
		this.workHoursPerMonth = workHoursPerMonth;
	}

	public void setTotalWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
}