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
	   String name;
	   double wage=0;
	   double bonus=0;
	   // Variable that save the selection from the user in the main menu
	   int millerCategory;
	   // Variable that save the index in the array of millersArray
	   int millerCounter;
	   Scanner scn = new Scanner(System.in);
	   System.out.printf("SAMPLE OUTPUTS FOR LAB 5 - POLYMORPHISM\n\n");
	   System.out.printf("How many millers do you want to enter ?\n");
	   millerCounter=scn.nextInt();
	   Millers[] millersArray = new Millers[millerCounter];
	   do {
		   System.out.printf("Select the category of this Miller: \n1. Consultan \n2. Employee \n3. Supervisor\n");
		   //Save the selection from the user in the variable millerCategory
		   millerCategory=scn.nextInt();
		   //Start to store data in the millerCategory
	   		System.out.printf("Write the name of the Miller: ");
	        name=scn.next();
	        switch (millerCategory) {
		   	case 1: {
		        System.out.printf("Enter the hours done by %s : ", name);
		        wage=scn.nextDouble();
		        Consultants consultant = new Consultants(name, wage);
		        //Add the consultant to the array of Millers
		        millersArray[millerCounter-1]= consultant;
		        //Display in console the payment of the miller
		        System.out.printf("Total Pay for this miller is: %.1f\n\n", millersArray[millerCounter-1].biWeeklyPay(wage));
		        //Add up a number in the variable millerCounter for allow to the next entry to store the Miller in the next index available
		        millerCounter--;
		        break;
		   		}
		     case 2: {
		         System.out.printf("Enter the anual pay for %s : ", name);
		         wage=scn.nextDouble();
		         Employees employee = new Employees(name, wage);
		         //Add the consultant to the array of Millers
		         millersArray[millerCounter-1]= employee;
			     //Display in console the payment of the miller
			     System.out.printf("Total Pay for this miller is: %.1f\n\n", millersArray[millerCounter-1].biWeeklyPay(wage));
		         millerCounter--;
		         break;
		   		}
		     case 3: {
		         System.out.printf("Enter the anual pay for %s : ", name);
		         wage=scn.nextDouble();
		         System.out.printf("Enter the bonus for %s : ", name);
		         bonus=scn.nextDouble();
		         Supervisors supervisor = new Supervisors(name, wage,bonus);
		         //Add the consultant to the array of Millers
		         millersArray[millerCounter-1]= supervisor;
		       //Display in console the payment of the miller
			     System.out.printf("Total Pay for this miller is: %.1f\n\n", millersArray[millerCounter-1].biWeeklyPay(wage));
		         millerCounter--;
		         break;
		   		}
		     default: {System.out.printf("Please, Select the category of this Miller: \\n1. Consultan \\n2. Employee \\n3. Supervisor\\n\"");
		     break;}
	     	}
     	} while (millerCounter>0);
	     scn.close();
	 System.out.printf("Program Ended\n");
   	}
}

