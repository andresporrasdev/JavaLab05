
package polymorphism;

import java.util.Scanner;

/**
   This class is called the MillerTest Class and provides the main method for your program.
   This program shows polymorphism by applying a method to objects of different classes. 
   Note that in your program, the Users should be prompted to input hours done worked by each miller. 
   You must implement using an array. 
   The order of the workers in the output is Consultants, Employees and Supervisors.
   Use the names in the output sample file provided for you. 
   Assume an annual pay, for example $84,000 and $30 as a Supervisor's bonus.
*/

// YOUR CODE TO IMPLEMENT THIS CLASS STARTS HERE!!!

public class MillersTest
{
   public static void main(String[] args)
   {
	     String name;
	     double wage;
	     double bonus;
	     int millerCategory;

	     System.out.printf("SAMPLE OUTPUTS FOR LAB 5 - POLYMORPHISM\r\n\n");
	     do {
		     Scanner scn = new Scanner(System.in);

		     System.out.printf("Select the cateogory of this Miller: \n1. Consultan \n2. Employee \n3. Supervisor\n4. Exit\n");
		     millerCategory=scn.nextInt();
		     switch (millerCategory) {
			     case 1: {
			         System.out.printf("Write the name of the Consultant: ");
			         name=scn.next();
			         System.out.printf("Enter the hours done by %s : ", name);
			         wage=scn.nextDouble();
			         Consultants consultant = new Consultants(name, wage);
			         System.out.printf("Total Pay for this miller is: %.1f\n", consultant.biWeeklyPay(wage));
			         System.out.printf("Do you want to calculte the wage for another Miller? true or false\n");
			         boolean continueProgram=scn.nextBoolean();
			         if (continueProgram) {
				        break;
			         } else{
			        	millerCategory=4;
				        break;
			         	}
			     	}
			     case 2: {
			         System.out.printf("Write the name of the Employee: ");
			         name=scn.next();
			         System.out.printf("Enter the anual pay for %s : ", name);
			         wage=scn.nextDouble();
			         Employees employee = new Employees(name, wage);
			         System.out.printf("Total Pay for this miller is: %.1f\n", employee.biWeeklyPay(wage));
			         System.out.printf("Do you want to calculte the wage for another Miller? true or false\n");
			         boolean continueProgram=scn.nextBoolean();
			         if (continueProgram) {
				        break;
			         } else{
			        	millerCategory=4;
				        break;
			         	}
			     	}
			     case 3: {
			         System.out.printf("Write the name of the Supervisor: ");
			         name=scn.next();
			         System.out.printf("Enter the anual pay for %s : ", name);
			         wage=scn.nextDouble();
			         System.out.printf("Enter the bonus for %s : ", name);
			         bonus=scn.nextDouble();
			         Supervisors supervisor = new Supervisors(name, wage,bonus);
			         System.out.printf("Total Pay for this miller is: %.1f\n", supervisor.biWeeklyPay(wage));
			         System.out.printf("Do you want to calculte the wage for another Miller? true or false\n");
			         boolean continueProgram=scn.nextBoolean();
			         if (continueProgram) {
				        break;
			         } else{
			        	millerCategory=4;
				        break;
			         	}
			     	}
			     default: System.out.printf("Program Ended");
			     scn.close();
		     	}
	     	} while (millerCategory!=4);
	     System.out.printf("Program Ended");
   	}
}

