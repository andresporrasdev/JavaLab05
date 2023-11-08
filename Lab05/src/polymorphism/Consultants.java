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
This code in this file is for the Consultant Class. A Consultant is a miller who is paid for every hour worked.
*/
class Consultants extends Millers{
	/**
	 *
	 * Variable for save the wage of a consultant
	 */
	private double consultantWage;
	/**
	 * Getter for consultantWage
	 * @return consultantWage Return the wage of the consultant
	 */
	public double getConsultantWage() {
		return consultantWage;
	}
	/**
	 * Setter for consultantWage
	 * @param consultantWage Set the wage of the consultant
	 */
	public void setConsultantWage(double consultantWage) {
		this.consultantWage = consultantWage;
	}

	/**
	 * 
	   This portion of your code constructs an hourly paid consultant with a given name and biweekly wage.
	   @param name the name of this consultant
	   @param wage the consultant wage per hour 
	*/
	public Consultants(String name, double wage) {
		super();
		setName(name);
		consultantWage=wage;
	}
	
	/**
	 * Method Override Millers for calculate wage for consultants, if they works more than 76 hours
	 * they will have a bonus of 50% by each additional hour
	 * @param hoursWorked Hours worked by the consultant
	 * @return pay Return the final wage of the consultant
	 */
	@Override
	public double biWeeklyPay(double hoursWorked) {
	   double pay = hoursWorked * consultantWage;
	
	// In this part of your code, an overtime amount is added if the Consultant works for more than 76 hours bi-weekly.
	// Review this portion of code carefully to include the code to fully satisfy this condition.
	  
	// SOME CODE GOES HERE BEFORE THE CODE BELOW:
	    
	      pay = pay + ((hoursWorked - 76) * (0.5 * consultantWage));
	   
	   return pay;
	}
}


