// BaseKnownCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Base implementation of a KnownCommandParser, providing generally-
// applicable functionality that all of them share

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;


abstract class BaseKnownCommandParser implements KnownCommandParser
{
	public abstract Command parse(String[] commandWords);
	
	
	protected Command parseFailure()
	{
		throw new InvalidCommandException(getFormatMessages());
	}
	
	
	protected abstract String[] getFormatMessages(); 
}
