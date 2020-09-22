/**
 * 
 */
package employee;

/**
 * @author saideeksha
 *
 */
public class Employee_wage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_PART_TIME=2;
        int IS_FULL_TIME=1;
        int empWage=0;
        int MAX_WORKING_HOUR=100;
        int EMP_WAGE_PER_HOUR=20;
        int empCheck=(int)(Math.floor(Math.random()*10)%3);
        int workingDays=0;
        int MAX_WORKING_DAYS=20;
        if(empCheck==1) {
        	System.out.println("Employee is present-FULL TIME");
        	empWage=MAX_WORKING_HOUR*EMP_WAGE_PER_HOUR;
        }
        else if(empCheck==2) {
        	System.out.println("Employee is present-PART TIME");
        	empWage=4*EMP_WAGE_PER_HOUR*MAX_WORKING_DAYS;
        }
        else {
        	System.out.println("Employee is absent");
        }
        System.out.println(empWage);
	}

}
