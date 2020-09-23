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
        int IS_FULL_TIME=1;
        int empWage=0;
        int empHour=0;
        int MAX_WORKING_HOUR=100;
        int EMP_WAGE_PER_HOUR=20;
        int empCheck=(int)(Math.floor(Math.random()*10)%3);
        int MAX_WORKING_DAYS=20;
        switch(empCheck) {
        case 1:
        	empCheck=IS_FULL_TIME;
        	System.out.println("Employee Present - FULL TIME");
        	empHour=8;
        	break;
        case 2:
        	empCheck=IS_PART_TIME;
        	System.out.println("Employee Present - PART TIME");
        	empHour=4;
        	break;
        default:
            empHour=0;
            break;
        }
        if(MAX_WORKING_HOUR/empHour<MAX_WORKING_DAYS && empHour!=0) {
        	empWage=MAX_WORKING_HOUR*EMP_WAGE_PER_HOUR;
        	System.out.println("Employee Wage for 100hrs : "+empWage);
        }
        else if(MAX_WORKING_HOUR/empHour>MAX_WORKING_DAYS && empHour!=0) {
        	empWage=4*EMP_WAGE_PER_HOUR*MAX_WORKING_DAYS;
        	System.out.println("Employee Wage for 20days : "+empWage);
        }
	}

}
