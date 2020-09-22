/**
 * 
 */
package employee;

/**
 * @author saideeksha
 *
 */
public class Employee_wage_month {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_PART_TIME=2;
        int IS_FULL_TIME=1;
        int empWage=0;
        int empHour=0;
        int EMP_WAGE_PER_HOUR=20;
        int empCheck=(int)(Math.floor(Math.random()*10)%3);
        int workingDays=20;
        switch(empCheck) {
        case 1:
        	empCheck=IS_FULL_TIME;
        	System.out.println("Employee is present-FULL TIME");
        	empHour=8;
        	break;
        case 2:
        	empCheck=IS_PART_TIME;
        	System.out.println("Employee is present-PART TIME");
        	empHour=4;
        	break;
        default:
        	System.out.println("Employee is absent");
            break;
        }
        empWage=empHour*EMP_WAGE_PER_HOUR*workingDays;
        System.out.println("Employee Wage: "+empWage);
	}

}
