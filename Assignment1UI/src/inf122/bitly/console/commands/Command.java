// Command.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Interface representing one command to be executed against the state of the
// racetrack, returning a result.  This is literally an example of the GoF
// Command pattern.

package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.state.BitlyContext;


public interface Command
{
	CommandResult execute(BitlyContext state);
}
