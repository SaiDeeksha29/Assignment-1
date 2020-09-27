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

		Company obj = new Company(20,30,200);
		int Total = obj.EmpWage();

		// Display of Employee Total Wage
		System.out.println("The Employee Total Wage for Maximum Hours or Days : " + Total);

	}
}
