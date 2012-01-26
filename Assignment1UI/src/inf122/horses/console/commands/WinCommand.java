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
import java.util.List;


public class WinCommand extends SingleHorseBetCommand
{
	public WinCommand(int horseNumber, int amountPerHorse, List<String> horseNumbers)
	{
		super(horseNumber, amountPerHorse, horseNumbers);
	}
	
	
	public CommandResult execute(RacetrackState state)
	{
		// Inf122TBD: Return an actual result
		return new UnimplementedCommandResult();
	}
}
