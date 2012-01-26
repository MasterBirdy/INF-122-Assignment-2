// HorseNumbersParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parser that takes a sequence of horse numbers and parses them into a
// Set<String>, failing if there are any duplicates

package inf122.horses.console.parsers;

import java.util.HashSet;
import java.util.Set;


public class HorseNumbersParser
{
	public Set<String> parse(String[] horseNumberWords)
	{
		Set<String> horseNumbers = new HashSet<String>();
		
		for (String horseNumber : horseNumberWords)
		{
			if (horseNumbers.contains(horseNumber))
			{
				throw new IllegalArgumentException("Duplicate horse exception");
			}
			else
			{
				horseNumbers.add(horseNumber);
			}
		}
		
		return horseNumbers;
	}
}
