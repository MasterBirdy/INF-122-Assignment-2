// RacetrackConsoleFactory.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Isolates the design decision involved in creating a new RacetrackConsole.

package inf122.horses.console;

import inf122.horses.console.io.ConsoleCommandStreamsFactory;


public class RacetrackConsoleFactory
{
	public static RacetrackConsole create()
	{
		RacetrackState emptyRacetrackState = RacetrackStateFactory.createEmpty();
		
		return new RacetrackConsole(
			emptyRacetrackState,
			new ConsoleCommandStreamsFactory());
	}
}
