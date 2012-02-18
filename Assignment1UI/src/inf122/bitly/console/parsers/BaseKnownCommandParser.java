// BaseKnownCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Base implementation of a KnownCommandParser, providing generally-
// applicable functionality that all of them share

package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.Command;


abstract class BaseKnownCommandParser implements KnownCommandParser
{
	public Command parse(String[] commandWords)
	{
		try
		{
			return parseWords(commandWords);
		}
		catch (Exception e)
		{
			return parseFailure();
		}
	}
	
	
	protected abstract Command parseWords(String[] commandWords);
	
	
	protected int parseIntInRange(String commandWord, int min, int max)
	{
		try
		{
			int value = Integer.parseInt(commandWord);
			
			if (value < min || value > max)
			{
				return parseFailure();
			}
			else
			{
				return value;
			}
		}
		catch (NumberFormatException e)
		{
			return parseFailure();
		}
	}
	
	
	protected <T> T parseFailure()
	{
		throw new InvalidCommandException(getFormatMessages());
	}
	
	
	protected abstract String[] getFormatMessages(); 
}
