package employee;

public interface IComputeEmpWage {
	public void ComputeEmpWage();

	public void addCompanyEmpWage(int empWagePerHour, int workDaysPerMonth, int workHoursPerMonth, String companyName);
}
