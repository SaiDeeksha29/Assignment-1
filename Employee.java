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
        System.out.println("Welcome to Employee Wage Computation");
        int IS_PART_TIME=2;
        int EMP_WAGE_PER_HOUR=20;
        int empHour=0;
        int empWage=0;
        double empCheck=Math.floor(Math.random()*10)%3;
        if(empCheck==IS_PART_TIME) {
        	empHour=4;
        }
        else {
        	System.out.println("Employee is absent");
        }
        empWage=empHour*EMP_WAGE_PER_HOUR;
        System.out.println("Employee Wage: "+empWage);
	}

}
