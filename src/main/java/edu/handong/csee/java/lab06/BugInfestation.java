package edu.handong.csee.java.lab06;//Instructs the BugInfestation class to be complied and stored in edu.handong.csee.java.lab06

import java.util.Scanner;//importing a package, java.util.Scanner. A package is a kind of a external objects created by other developer.

/**
 * This class defines a BugInfestation object
 * The BugInfestation has main() method
 * @author Lee MyeongHui
 * @version java version "9.0.4"
 *
 */
public class BugInfestation {


	/**
	 * This is main method that starts our programs 
	 * @param args, String arrays, called args, can be received as the method's factor values
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double ONE_BUG_VOLUME = 0.002;//Create double type local variable ONE_BUG_VOLUME, final is a way to create a constant, The constant can not be changed during execution
		final double GROWTH_RATE = 0.95;//Create double type local variable GROWTH_RATE, final is a way to create a constant, The constant can not be changed during execution
		double newBugVolume;//Create double type local variable newBugVolume
		double newBugs;//Create double type local variable newBugs

		Scanner keyboard = new Scanner(System.in);//Create an object of the Scanner class

		System.out.print("Enter the total volume of your house in cubic feet:");//Outputs the string literal "Enter the total volume of your house in cubic feet:"
		double houseVolume = keyboard.nextDouble();//Create double type local variable houseVolume, Take one double from the keyboard and place it in the houseVolume

		System.out.print("Enter the estimated number of roaches in your house:");//Outputs the string literal "Enter the estimated number of cockroaches in your house:" 
		int startPopulation = keyboard.nextInt();//Create integer type local variable startPopulation, Take one integer from the keyboard and place it in the startPopulation

		double population = startPopulation;//Create double type local variable population, put startPopulation in population
		double totalBugVolume = population *ONE_BUG_VOLUME;//Create double type local variable totalBugVolume, put the multiplication of population and ONE_BUG_VOLUME in totalBugVolume 
		int countWeeks = 0;//Create integer type local variable countWeeks, put 0 in countWeeks


		while(totalBugVolume < houseVolume)//repeat statements in {} until the value of the totalBugVolume is smaller than the value of houseVolume
		{
			newBugs = population * GROWTH_RATE;//put the multiplication of population and GROWTH_RATE in newBugs
			newBugVolume = newBugs * ONE_BUG_VOLUME;//put the multiplication of newBugs and ONE_BUG_VOLUME in newBugVolume
			population += newBugs;//put the addition of population and newBugs in population
			totalBugVolume+=newBugVolume;//put the addition of totalBugVolume and newBugVolume in totalBugVolume
			countWeeks+=1;//put the addition of countWeeks and 1 in countWeeks

		}

		System.out.println("Starting with a roach population of " + startPopulation);//Outputs "Starting with a cockroach population of <the value of startPopulation>"
		System.out.println("and a house with a volume of " + houseVolume + " cubic feet");//Outputs "and a house with a volume of <the value of houseVolume> cubic feet"
		System.out.println("after " + countWeeks+ " weeks");//Outputs <the value of countWeeks> weeks"
		System.out.println("the house will be filled with "+(int)population+" roaches.");//Outputs "the house will be filled with < the value that changes the value of populaton to integer type> cockroaches." 
		System.out.println("They will fill a volume of " + (int)totalBugVolume+" cubic feet");//Outputs "They will fill a volume of <the value that changes the value of totalBugVolume  to integer type> cubic feet"
		System.out.println("Better call Debugging Experts Inc");//Outputs the string literal "Better call Debugging Experts Inc"

		keyboard.close();//Close Scanner Object

	}



}


