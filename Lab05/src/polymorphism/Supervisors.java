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
*This code should contain your Supervisor class declaration, constructor and method. 
*A Supervisor is an employee who also receives a bonus. 
*/
public class Supervisors extends Employees{
	/**
	 * Variable for saving the bonus of the supervisor
	 */
	private double bonusSupervisor;
	
	/**
	 * Getter for the bonus of the supervisor
	 * @return bonusSupervisor Return the bonus of the supervisor
	 */
	public double getBonusSupervisor() {
		return bonusSupervisor;
	}
	
	/**
	 * Setters for the bonus of the supervisor
	 * @param bonusSupervisor Set the bonus of the supervisor
	 */
	public void setBonusSupervisor(double bonusSupervisor) {
		this.bonusSupervisor = bonusSupervisor;
	}
	/**
   Constructs a supervisor with a given name, annual pay and bi-weekly bonus.
   @param name the name of this employee
   @param pay the annual pay
   @param bonus the bi-weekly bonus
 */
	Supervisors(String name, double pay, double bonus){
		super(name, pay);
		bonusSupervisor = bonus;
	}
	/**
	 * Method override for the weekly pay for supervisors
	 * @param hoursWorked annual Salary of the Supervisor
	 * @return The Final BiWeekly Pay of the supervisor
	 */
	@Override
	public double biWeeklyPay(double hoursWorked){
		return super.biWeeklyPay(hoursWorked)+bonusSupervisor;
	}
// Hint: Note the relationship between this class and any other class. How will you apply that to your code?

}


