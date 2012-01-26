// TakeCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the TAKE command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.TakeCommand;


class TakeCommandParser extends BaseKnownCommandParser
{
	public Command parse(String[] commandWords)
	{
		if (commandWords.length != 2)
		{
			return parseFailure();
		}
		
		try
		{
			return new TakeCommand(
				parseIntInRange(commandWords[1], 0, 100));
		}
		catch (NumberFormatException e)
		{
			return parseFailure();
		}
	}
	
	
	protected String[] getFormatMessages()
	{
		return new String[] {
			"TAKE <take_pct>",
			"     take_pct - Track's take percentage, a whole number in the range 0..100"
		};
	}
}
