// CancelCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the CANCEL command.

package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.CancelCommand;
import inf122.bitly.console.commands.Command;


class CancelCommandParser extends BaseKnownCommandParser
{
	public CancelCommandParser()
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
		
		return new CancelCommand(ticketId);
	}


	protected String[] getFormatMessages()
	{
		return new String[] {
			"CANCEL <ticketID>",
			"    ticketID - ticket ID of ticket to cancel"
		};
	}
	
	
	private TicketIdWordParser ticketIdWordParser;
}
