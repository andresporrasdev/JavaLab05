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
THIS IS SUPERCLASS NAMED Millers.

Each miller has a name and a method for computing the bi-weekly pay.
YOU DO NOT NEED TO DO MODIFIY THIS CODE. 
*/

public class Millers
{
	/**
	 * Variable for save the name of the Miller
	 */
private String name;

/**
   Constructs a miller with an empty name.
*/
public Millers()
{
   name = "";
}

/**
   Sets the name of this miller.
   @param millerName the new name 
*/
public void setName(String millerName)
{
   name = millerName;
}

/**
   Gets the name of this miller.
   @return the name 
*/
public String getName()
{
   return name; 
}

/**
   This portion of code computes the bi-weekly pay of work done by the miller.
   @param hoursWorked the number of hours worked bi-weekly
   @return the pay for the given number of hours
*/
public double biWeeklyPay(double hoursWorked)
{
   return 0; 
}
}

