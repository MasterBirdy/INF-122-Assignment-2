// TriBoxCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the TRIBOX command

package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.UnimplementedCommandResult;
import inf122.bitly.console.state.BitlyContext;

import java.util.Set;


public class TriBoxCommand implements Command
{
	public TriBoxCommand(
		int raceNumber, int amount,
		Set<String> horseNumbers)
	{
		this.raceNumber = raceNumber;
		this.amount = amount;
		this.horseNumbers = horseNumbers;
	}

	
	public CommandResult execute(BitlyContext state)
	{
		// Inf122TBD: Return an actual result
		return new UnimplementedCommandResult();
	}

	
	private int raceNumber;
	private int amount;
	private Set<String> horseNumbers;
}
