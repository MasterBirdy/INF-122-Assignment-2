// StopCommandResult.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Represents the result of a STOP command

package inf122.horses.console.results;

import java.util.Arrays;
import java.util.List;


public class StopCommandResult implements CommandResult
{
	public List<String> getConsoleOutput()
	{
		return Arrays.asList("Goodbye");
	}
	
	
	public boolean stopConsole()
	{
		return true;
	}
}
