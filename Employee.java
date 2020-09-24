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
        int hoursWorked=0;
        int dayCount=0;
        int totalWage=0;
        int MAX_WORKING_HOUR=100;
        int EMP_WAGE_PER_HOUR=20;
        int MAX_WORKING_DAYS=20;
        int empCheck=(int)(Math.floor(Math.random()*10)%3);
        
        // if-else changed to Switch to Check and Display Employee is Present or Absent 
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
        
        // Calculation of Daily Employee Wage
     	empWage = empHour * EMP_WAGE_PER_HOUR;
     			
     	// Tabular Display of Employee Details for Maximum Monthly Hours or Days
     	System.out.println("Day\tHours Worked\tTotal Wage");
     	while((hoursWorked+empHour)<=MAX_WORKING_HOUR && dayCount<MAX_WORKING_HOUR)
     	{	
     		dayCount++;
     		hoursWorked += empHour;
     		totalWage += empWage;
     		System.out.println(" "+dayCount+"  \t"+hoursWorked+"  \t\t"+totalWage);
     			
   		}
     			
     	// Calculations of Employee Wage for Hours left out of Maximum Hours
     	if(hoursWorked<MAX_WORKING_HOUR && dayCount<MAX_WORKING_HOUR)
     	{
     	    dayCount++;
     		totalWage += (MAX_WORKING_HOUR - hoursWorked) * EMP_WAGE_PER_HOUR;
     		hoursWorked = hoursWorked + (MAX_WORKING_HOUR - hoursWorked);
     		System.out.println(" "+dayCount+"  \t"+hoursWorked+"  \t\t"+totalWage);
     	}
     	
       // Display of Employee Total Wage
       System.out.println("The Employee Total Wage for Maximum Hours or Days : "+totalWage);
	}

}
