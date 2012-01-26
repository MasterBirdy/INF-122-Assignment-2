// KnownCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// A KnownCommandParser knows how to parse the words of a single command,
// assuming we already know which command it is (i.e., what the first
// word is).  This allows us to have separate objects for parsing each
// kind of command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;


interface KnownCommandParser
{
	Command parse(String[] commandWords); 
}
