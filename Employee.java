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
        int EMP_WAGE_PER_HOUR=20;
        int empCheck=(int)(Math.floor(Math.random()*10)%3);
        if(empCheck==IS_FULL_TIME) {
        	System.out.println("Employee is present");
        	empHour=8;
        }
        else {
        	System.out.println("Employee is absent");
        }
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
            empHour=0;
            break;
        }
        empWage=empHour*EMP_WAGE_PER_HOUR;
        System.out.println("Employee Wage: "+empWage);
        
	}

}
