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

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	public int getEmpWagePerHour() {
		return empWagePerHour;
	}

	public int getWorkDaysPerMonth() {
		return workDaysPerMonth;
	}

	public int getWorkHoursPerMonth() {
		return workHoursPerMonth;
	}

	public String getCompanyName() {
		return companyName;
	}

	public int getTotalEmpWage() {
		return totalEmpWage;
	}
}