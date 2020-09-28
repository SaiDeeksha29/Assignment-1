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

		Company A = new Company(20,15,100);
		System.out.println("Company A");
		int Total = A.EmpWage();
		Company B = new Company(25,20,90);
		System.out.println("Company B");
		int Total1 = B.EmpWage();
		Company C = new Company(15,25,120);
		System.out.println("Company C");
		int Total2 = C.EmpWage();
		
		// Display of Employee Total Wage
		System.out.println("The Employee Total Wage for Maximum Hours or Days for Company A: " + Total);
		System.out.println("The Employee Total Wage for Maximum Hours or Days for Company B: " + Total1);
		System.out.println("The Employee Total Wage for Maximum Hours or Days for Company C: " + Total2);
		
	}
}
