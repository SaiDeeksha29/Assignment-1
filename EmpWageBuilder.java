/**
 * 
 */
package employee;

/**
 * @author saideeksha
 *
 */
public class EmpWageBuilder {
	// static variables
	public static final int IS_PART_TIME = 2;
	public static final int IS_FULL_TIME = 1;

	private int numOfCompanies = 0;
	private CompanyEmpWage[] companyEmpWageArrays;

	public EmpWageBuilder() {
		companyEmpWageArrays = new CompanyEmpWage[5];
	}

	private void addCompanyEmpWage(int empWagePerHour, int workDaysPerMonth, int workHoursPerMonth, String companyName) {
		companyEmpWageArrays[numOfCompanies] = new CompanyEmpWage(empWagePerHour, workDaysPerMonth, workHoursPerMonth,
				companyName);
		numOfCompanies++;
	}

	private void ComputeEmpWage() {
		for (int i = 0; i < numOfCompanies; i++) {
			int totalEmpWage = this.ComputeEmpWage(companyEmpWageArrays[i]);
			System.out.println((companyEmpWageArrays[i].companyName) + " has total wage : " + totalEmpWage);
		}
	}

	private int ComputeEmpWage(CompanyEmpWage companyEmpWage) {
		// TODO Auto-generated method stub
		int empWage=0;
    	int hoursWorked=0;
    	int empHours=0;
    	int dayCount=0;
	
   //computation
	int empCheck = (int) (Math.floor(Math.random()*10) % 3);
	System.out.println("empCheck :"+empCheck);
    
	switch(empCheck)
	{
	   case 1:
	       empCheck = IS_FULL_TIME;
		   System.out.println("Employee is Present & Full Time");
		   empHours=8;
		   break;
		   
	   case 2:
		   empCheck = IS_PART_TIME;
		   System.out.println("Employee is Present & Part Time");
		   empHours=4;
		   break;
		   
	   default:
		   System.out.println("Employee is Absent");
		   break;
	}
	//daily wage calculation
	empWage = empHours * companyEmpWage.empWagePerHour;
	//Tabular display of employee details
	System.out.println("company\t\tDay\tHours Worked\tTotal Wage");
	while((hoursWorked + empHours) <= companyEmpWage.workHoursPerMonth && dayCount < companyEmpWage.workDaysPerMonth)
	{
		dayCount++;
		hoursWorked += empHours;
		companyEmpWage.totalEmpWage += empWage;
		System.out.println(" " +companyEmpWage.companyName+ " \t" + dayCount + " \t" + hoursWorked + " \t\t" + companyEmpWage.totalEmpWage);
	}
	if(hoursWorked < companyEmpWage.workHoursPerMonth && dayCount < companyEmpWage.workDaysPerMonth)
	{
		dayCount++;
		hoursWorked += (companyEmpWage.workHoursPerMonth - hoursWorked);
		companyEmpWage.totalEmpWage += (companyEmpWage.workHoursPerMonth - hoursWorked) * companyEmpWage.empWagePerHour ;
		System.out.println(" " +companyEmpWage.companyName+ " \t" + dayCount + " \t" + hoursWorked + " \t\t" + companyEmpWage.totalEmpWage);
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
