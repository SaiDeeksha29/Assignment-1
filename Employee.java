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
        double empCheck=Math.floor(Math.random()*10)%2;
        if(empCheck==1) {
        	System.out.println("Employee is present");
        }
        else {
        	System.out.println("Employee is absent");
        }
	}

}
