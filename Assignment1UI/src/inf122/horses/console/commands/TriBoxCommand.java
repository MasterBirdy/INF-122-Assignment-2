// TriBoxCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the TRIBOX command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.UnimplementedCommandResult;
import inf122.horses.console.state.RacetrackState;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class TriBoxCommand implements Command
{
	public TriBoxCommand(
		int raceNumber, int amount,
		Collection<String> horseNumbers)
	{
		this.raceNumber = raceNumber;
		this.amount = amount;
		this.horseNumbers = new HashSet<String>(horseNumbers);
	}

	
	public CommandResult execute(RacetrackState state)
	{
		// Inf122TBD: Return an actual result
		return new UnimplementedCommandResult();
	}

	
	private int raceNumber;
	private int amount;
	private Set<String> horseNumbers;
}
