// ExCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the EX command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.UnimplementedCommandResult;
import inf122.horses.console.state.RacetrackState;


public class ExCommand implements Command
{
	public ExCommand(
		int raceNumber, int amount,
		String firstHorseNumber, String secondHorseNumber)
	{
		this.raceNumber = raceNumber;
		this.amount = amount;
		this.firstHorseNumber = firstHorseNumber;
		this.secondHorseNumber = secondHorseNumber;
	}
	
	
	public CommandResult execute(RacetrackState state)
	{
		// Inf122TBD: Return an actual result
		return new UnimplementedCommandResult();
	}
	
	
	private int raceNumber;
	private int amount;
	private String firstHorseNumber;
	private String secondHorseNumber;
}
