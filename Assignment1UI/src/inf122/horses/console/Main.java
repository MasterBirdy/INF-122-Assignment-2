// Main.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Provides a main() method for executing the console-mode user interface
// for exercising the engine of the racetrack management system.

package inf122.horses.console;


public class Main
{
	public static void main(String[] args)
	{
		RacetrackConsoleFactory.create().run();
	}
}
