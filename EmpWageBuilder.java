/**
 * 
 */
package employee;

import java.util.ArrayList;

/**
 * @author saideeksha
 *
 */
public class EmpWageBuilder implements IComputeEmpWage {
	// static variables
	public static final int IS_PART_TIME = 2;
	public static final int IS_FULL_TIME = 1;

	private ArrayList<CompanyEmpWage> companyEmpWageList;

	public EmpWageBuilder() {
		companyEmpWageList = new ArrayList<>();
	}

	public void addCompanyEmpWage(int empWagePerHour, int workDaysPerMonth, int workHoursPerMonth, String companyName) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(empWagePerHour, workDaysPerMonth, workHoursPerMonth,
				companyName);
		companyEmpWageList.add(companyEmpWage);
	}

	public void ComputeEmpWage() {
		for (CompanyEmpWage company: companyEmpWageList) {
			ComputeEmpWage(company);
			System.out.println("Employee wage of the "+company.getCompanyName()+"is : "+company.getTotalEmpWage());
			System.out.println("Employee wage of the "+company.getCompanyName()+"is : "+company.getDailyEmpWage());
		}
	}

	private int ComputeEmpWage(CompanyEmpWage companyEmpWage) {
		// TODO Auto-generated method stub
		int empWage = 0;
		int hoursWorked = 0;
		int empHours = 0;
		int dayCount = 0;

		// computation
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

		switch (empCheck) {
		case 1:
			empCheck = IS_FULL_TIME;
			System.out.println("Employee is Present & Full Time");
			empHours = 8;
			break;

		case 2:
			empCheck = IS_PART_TIME;
			System.out.println("Employee is Present & Part Time");
			empHours = 4;
			break;

		default:
			System.out.println("Employee is Absent");
			break;
		}
		// daily wage calculation
		empWage = empHours * companyEmpWage.empWagePerHour;
		companyEmpWage.setDailyEmpWage(empWage);
		// Tabular display of employee details
		System.out.println("company\t\tDay\tHours Worked\tTotal Wage");
		while ((hoursWorked + empHours) <= companyEmpWage.workHoursPerMonth
				&& dayCount < companyEmpWage.workDaysPerMonth) {
			dayCount++;
			hoursWorked += empHours;
			companyEmpWage.totalEmpWage += empWage;
			System.out.println(" " + companyEmpWage.companyName + " \t" + dayCount + " \t" + hoursWorked + " \t\t"
					+ companyEmpWage.totalEmpWage);
		}
		if (hoursWorked < companyEmpWage.workHoursPerMonth && dayCount < companyEmpWage.workDaysPerMonth) {
			dayCount++;
			hoursWorked += (companyEmpWage.workHoursPerMonth - hoursWorked);
			companyEmpWage.totalEmpWage += (companyEmpWage.workHoursPerMonth - hoursWorked)
					* companyEmpWage.empWagePerHour;
			System.out.println(" " + companyEmpWage.companyName + " \t" + dayCount + " \t" + hoursWorked + " \t\t"
					+ companyEmpWage.totalEmpWage);
		}
		return companyEmpWage.totalEmpWage;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Welcome Message
		System.out.println("Welcome to Employee Wage Computation");
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage(20, 15, 100, "Company A");
		empWageBuilder.addCompanyEmpWage(10, 20, 90, "Company B");
		empWageBuilder.ComputeEmpWage();
	}
}
