// WelcomeCommandResult.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Represents the result of a WELCOME command

package inf122.bitly.console.results;

import java.util.Arrays;
import java.util.List;


public class WelcomeCommandResult implements CommandResult
{
	public List<String> getConsoleOutput()
	{
		return Arrays.asList("Informatics 122 Winter 2012 - Assignment #2 - READY");
	}
	
	
	public boolean stopConsole()
	{
		return false;
	}
}
