// ExBoxCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the EXBOX command

package inf122.horses.console.commands;


public class ExBoxCommand extends ExCommand
{
	public ExBoxCommand(
		int raceNumber, int amount,
		String firstHorseNumber, String secondHorseNumber)		
	{
		super(raceNumber, amount, firstHorseNumber, secondHorseNumber, true);
	}
}
