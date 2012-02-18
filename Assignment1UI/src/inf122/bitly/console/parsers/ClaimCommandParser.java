// ClaimCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the CLAIM command.

package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.ClaimCommand;
import inf122.bitly.console.commands.Command;


class ClaimCommandParser extends BaseKnownCommandParser
{
	public ClaimCommandParser()
	{
		ticketIdWordParser = new TicketIdWordParser();
	}
	
	
	protected Command parseWords(String[] commandWords)
	{
		if (commandWords.length != 2)
		{
			return parseFailure();
		}
		
		int ticketId = ticketIdWordParser.parse(commandWords[1]);
		
		return new ClaimCommand(ticketId);
	}


	protected String[] getFormatMessages()
	{
		return new String[] {
			"CLAIM <ticketID>",
			"    ticketID - ticket ID of ticket to claim"
		};
	}
	
	
	private TicketIdWordParser ticketIdWordParser;
}
