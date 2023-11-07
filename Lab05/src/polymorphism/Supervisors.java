
package polymorphism;

/**
This code should contain your Supervisor class declaration, constructor and method. 
A Supervisor is an employee who also receives a bonus. 
You must implement the bi-weekly pay for the employee according to instructions provided.
*/

// TO DO: TASK 1 - YOUR CODE FOR THE CLASS GOES HERE
// Declare the class and any variable
public class Supervisors extends Employees{
	double bonusSupervisor;
	// YOUR Constructor code goes here!!!
	/**
    TO DO: TASK 2 - Constructs a supervisor with a given name, annual pay and bi-weekly bonus.
   @param name the name of this employee
   @param pay the annual pay
   @param bonus the bi-weekly bonus
 */
	Supervisors(String name, double wage, double bonus){
		super(name, wage);
		bonusSupervisor = bonus;
	}
	// TO DO: TASK 3 - YOUR CODE FOR COMPUTING THE BI-WEEKLY PAY FOR THIS CATEGORY OF MILLER GOES HERE.
	@Override
	public double biWeeklyPay(int hoursWorked){
		return hoursWorked*bonusSupervisor;
	}
// Hint: Note the relationship between this class and any other class. How will you apply that to your code?

}


