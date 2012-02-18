// PoolCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the POOL command.

package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.BetType;
import inf122.bitly.console.commands.Command;
import inf122.bitly.console.commands.PoolCommand;


class PoolCommandParser extends BaseKnownCommandParser
{
	public PoolCommandParser()
	{
		betTypeWordParser = new BetTypeWordParser();
		raceNumberWordParser = new RaceNumberWordParser();
	}
	

	protected Command parseWords(String[] commandWords)
	{
		if (commandWords.length != 3)
		{
			return parseFailure();
		}
		
		BetType betType = betTypeWordParser.parse(commandWords[1]);
		int raceNumber = raceNumberWordParser.parse(commandWords[2]);
		
		return new PoolCommand(betType, raceNumber);
	}


	protected String[] getFormatMessages()
	{
		return new String[] {
			"POOL <betType> <race#>",
			"    betType - The type of bet (WIN, PLACE, SHOW, EX, TRI)",
			"    race#   - Race # for which to view pool"
		};
	}
	

	private BetTypeWordParser betTypeWordParser;
	private RaceNumberWordParser raceNumberWordParser;
}
