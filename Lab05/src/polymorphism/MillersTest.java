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

import java.util.ArrayList;
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
public class MillersTest
{
	/**
	 * Main method for MillerTest Class
	 * @param args No arguments required for main method
	 */
   public static void main(String[] args) {
	   //ArrayList for saving the Millers and add as many Millers as the user wants
	   ArrayList<Millers> millersArray = new ArrayList<Millers>();
	   String name;
	   double wage;
	   double bonus;
	   // Variable that save the selection from the user in the main menu
	   int millerCategory;
	   // Variable that save the index in the ArrayList millersArray
	   int millerCounter=0;
	   System.out.printf("SAMPLE OUTPUTS FOR LAB 5 - POLYMORPHISM\r\n\n");
	   do {
		   Scanner scn = new Scanner(System.in);
		   System.out.printf("Select the cateogory of this Miller: \n1. Consultan \n2. Employee \n3. Supervisor\n4. Exit\n");
		   //Save the selection from the user in the variable millerCategory
		   millerCategory=scn.nextInt();
		   //Start of the menu in console
		   switch (millerCategory) {
		   	case 1: {
		   		System.out.printf("Write the name of the Consultant: ");
		        name=scn.next();
		        System.out.printf("Enter the hours done by %s : ", name);
		        wage=scn.nextDouble();
		        Consultants consultant = new Consultants(name, wage);
		        //Add the consultant to the ArrayList of Millers
		        millersArray.add(consultant);
		        //System.out.printf("Total Pay for this miller is: %.1f\n", consultant.biWeeklyPay(wage));
		        //Display in console the payment of the user
		        System.out.printf("Total Pay for this miller is: %.1f\n", millersArray.get(millerCounter).biWeeklyPay(wage));
		        //Add up a number in the variable millerCounter for allow to the next entry to store the Miller in the next index available
		        millerCounter++;
		        //Ask the user if they want to continue adding Millers or finish the program
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
		         millersArray.add(employee);
		         //System.out.printf("Total Pay for this miller is: %.1f\n", employee.biWeeklyPay(wage));
		         System.out.printf("Total Pay for this miller is: %.1f\n", millersArray.get(millerCounter).biWeeklyPay(wage)); 
		         millerCounter++;
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
		         millersArray.add(supervisor);
		        // System.out.printf("Total Pay for this miller is: %.1f\n", supervisor.biWeeklyPay(wage));
		         System.out.printf("Total Pay for this miller is: %.1f\n", millersArray.get(millerCounter).biWeeklyPay(wage)); 
		         millerCounter++;
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
     	} while (millerCategory!=4); //4 Means the number of the selection of the user in the menu and the program will finish if the selection is 4
	 System.out.printf("Program Ended\n");
   	}
}

