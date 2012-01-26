// Command.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Interface representing one command to be executed against the state of the
// racetrack.  This is literally an example of the GoF Command pattern.

package inf122.horses.console.commands;

import inf122.horses.console.RacetrackState;


public interface Command
{
	void execute(RacetrackState state);
}
