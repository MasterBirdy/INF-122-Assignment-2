// PostCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the POST command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.PostCommand;


class PostCommandParser extends BaseKnownCommandParser
{
	public PostCommandParser()
	{
		raceNumberWordParser = new RaceNumberWordParser();
	}
	
	
	protected Command parseWords(String[] commandWords)
	{
		if (commandWords.length != 2)
		{
			return parseFailure();
		}
		
		int raceNumber = raceNumberWordParser.parse(commandWords[1]);
		
		return new PostCommand(raceNumber);
	}
	
	
	protected String[] getFormatMessages()
	{
		return new String[] {
			"POST <race#>",
			"     race#  - race number that has reached post time"
		};
	}
	
	
	private RaceNumberWordParser raceNumberWordParser;
}
