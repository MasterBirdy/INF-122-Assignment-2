// ExBoxCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the EXBOX command

package inf122.horses.console.commands;

import inf122.horses.console.RacetrackState;
import inf122.horses.console.results.CommandResult;
import inf122.horses.console.results.UnimplementedCommandResult;


public class ExBoxCommand implements Command
{
	public CommandResult execute(RacetrackState state)
	{
		// Inf122TBD: Return an actual result
		return new UnimplementedCommandResult();
	}
}
