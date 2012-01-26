// WinCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the WIN command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.UnimplementedCommandResult;
import inf122.horses.console.state.RacetrackState;
import java.util.Set;


public class WinCommand implements Command
{
	public WinCommand(int horseNumber, int amountPerHorse, Set<String> horseNumbers)
	{
		this.horseNumber = horseNumber;
		this.amountPerHorse = amountPerHorse;
		this.horseNumbers = horseNumbers;
	}
	
	
	public CommandResult execute(RacetrackState state)
	{
		// Inf122TBD: Return an actual result
		return new UnimplementedCommandResult();
	}
	
	
	private int horseNumber;
	private int amountPerHorse;
	private Set<String> horseNumbers;
}
