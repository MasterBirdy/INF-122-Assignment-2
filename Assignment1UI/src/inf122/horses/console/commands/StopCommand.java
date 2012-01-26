// StopCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the STOP command

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.StopCommandResult;
import inf122.horses.console.state.RacetrackState;


public class StopCommand implements Command
{
	public CommandResult execute(RacetrackState state)
	{
		return new StopCommandResult();
	}
}
