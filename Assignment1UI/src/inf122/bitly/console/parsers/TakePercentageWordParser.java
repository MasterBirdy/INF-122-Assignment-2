// TakePercentageWordParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// A word parser that parses take percentages

package inf122.bitly.console.parsers;


class TakePercentageWordParser extends RangedIntegerWordParser
{
	public TakePercentageWordParser()
	{
		super(0, 100);
	}
}
