/**
 * 
 */
package employee;

/**
 * @author saideeksha
 *
 */
public class empWage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int EMP_WAGE_PER_HOUR=20;
        int empHour=0;
        int empWage=0;
        int IS_FULL_TIME=1;
        double empCheck=Math.floor(Math.random()*10)%3;
        if(empCheck==IS_FULL_TIME) {
        	empHour=8;
        }
        empWage=empHour*EMP_WAGE_PER_HOUR;
        System.out.println("Employee Wage: "+empWage);
	}

}
