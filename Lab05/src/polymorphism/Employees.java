/*
* Title Assessment: Lab05
* Student Name: Andres Camilo Porras Becerra
* Due Date: 12 Nov
* Description: This program shows polymorphism by applying a method to objects of different classes. 
* Professor Name: Islam Gomaa
* Course CST8284 Section 331
*/
/**
 * This package shows how to use polymorphism by applying a method to objects of different classes
 * @author Andres Porras
 * @version 1.0
 * @see lab05
*/
package polymorphism;
/**
*This class represents the employee. An employee is paid the same (particular)
*amount regardless of the hours (additional) the employee worked.
*/
public class Employees extends Millers {
	
	/**
	 * Variable for save the annualPay for Employees
	 */
	private double annualPay;
	
	/**
	 * Getter for annualPay for Employees
	 * @return annualPay Return the annualPay of the employee
	 */
	public double getAnnualPay() {
		return annualPay;
	}
	
	/**
	 * Setter for annualPay for Employees
	 * @param annualPay Set the annualPay of the employee
	 */
	public void setAnnualPay(double annualPay) {
		this.annualPay = annualPay;
	}
	/**
	
	   Constructs an employee with a given name and an annual pay.
	   @param name the name of this employee
	   @param pay the annual pay of the employee
	 */
	public Employees(String name, double pay) {
	   setName(name);
	   annualPay = pay;
	}
	/**
	 * Method override for the weekly pay for employee
	 * @return The annual Pay of the Employee
	 */
	@Override
	public double biWeeklyPay(double hoursWorked) {
		// YOUR CODE GOES IN HERE.
		return annualPay/26;
	}
}

