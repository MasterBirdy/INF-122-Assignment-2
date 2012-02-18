// WelcomeCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the WELCOME command.

package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.Command;
import inf122.bitly.console.commands.WelcomeCommand;


class WelcomeCommandParser implements KnownCommandParser
{
	public Command parse(String[] commandWords)
	{
		return new WelcomeCommand();
	}
}
