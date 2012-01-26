// BogusCommandResult.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Represents the result of a command that has not yet been implemented.

package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;


public class UnimplementedCommandResult implements CommandResult
{
	public List<String> getConsoleOutput()
	{
		return Arrays.asList("[Command not yet implemented]");
	}
	
	
	public boolean stopConsole()
	{
		return false;
	}
}
