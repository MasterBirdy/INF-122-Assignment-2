// Command.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Interface representing one command to be executed against the state of the
// racetrack, returning a result.  This is literally an example of the GoF
// Command pattern.

package inf122.horses.console.commands;

import inf122.horses.console.results.CommandResult;
import inf122.horses.console.state.RacetrackState;


public interface Command
{
	CommandResult execute(RacetrackState state);
}
