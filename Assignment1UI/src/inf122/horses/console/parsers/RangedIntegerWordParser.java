// RangedIntegerWordParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// WordParser that expects an integer value in a given range

package inf122.horses.console.parsers;


public class RangedIntegerWordParser implements WordParser<Integer>
{
	public RangedIntegerWordParser(int min, int max)
	{
		this.min = min;
		this.max = max;
	}
	
	
	public Integer parse(String word)
	{
		int value = Integer.parseInt(word);
		
		if (value < min || value > max)
		{
			throw new IllegalArgumentException(word);
		}
		else
		{
			return value;
		}
	}
	
	
	public int getMin()
	{
		return min;
	}
	
	
	public int getMax()
	{
		return max;
	}
	
	
	private int min;
	private int max;
}
