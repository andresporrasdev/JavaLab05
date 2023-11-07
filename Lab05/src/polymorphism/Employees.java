
package polymorphism;

public class Employees extends Millers {

	/**
	This class represents the employee. An employee is paid the same (particular) amount regardless of the hours (additional) the employee worked.
	*/
	
	// TO DO: TASK 1 - DECLARE YOUR CLASS AND ANY VARIABLES HERE.
	private double annualPay;
	/**
	
	   Constructs an employee with a given name and an annual pay.
	   @param name the name of this employee
	   @param pay the annual pay of the employee
	 */
	public Employees(String name, double pay) {
	   setName(name);
	   annualPay = pay;
	}
	
	// TO DO: TASK - This portion of your code computes the pay for this category of miller.
		@Override
		public double biWeeklyPay(double hoursWorked) {
			// YOUR CODE GOES IN HERE.
			return annualPay/26;
		}
}

