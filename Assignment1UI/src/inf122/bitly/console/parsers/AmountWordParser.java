// AmountWordParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Word parser that parses amounts (e.g., an amount of a bet)

package inf122.bitly.console.parsers;


public class AmountWordParser extends RangedIntegerWordParser
{
	public AmountWordParser()
	{
		super(1, Integer.MAX_VALUE);
	}
}
