// InvalidCommandException.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Exception thrown when an invalid command is detected during parsing.
// Carries with it a sequence of messages that indicate what was wrong
// with the command.

package inf122.bitly.console.parsers;

import java.util.Arrays;
import java.util.List;


public class InvalidCommandException extends RuntimeException
{
	public InvalidCommandException(String... messages)
	{
		super("Invalid command: " + messages[0]);
		this.messages = Arrays.asList(messages);
	}
	
	
	public Iterable<String> getMessages()
	{
		return messages;
	}
	
	
	private List<String> messages;
}
