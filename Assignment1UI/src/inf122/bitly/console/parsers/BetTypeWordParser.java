package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.BetType;


public class BetTypeWordParser implements WordParser<BetType>
{
	public BetType parse(String word)
	{
		if (word.equals("WIN"))
		{
			return BetType.WIN;
		}
		else if (word.equals("PLACE"))
		{
			return BetType.PLACE;
		}
		else if (word.equals("SHOW"))
		{
			return BetType.SHOW;
		}
		else if (word.equals("EX"))
		{
			return BetType.EXACTA;
		}
		else if (word.equals("TRI"))
		{
			return BetType.TRIFECTA;
		}
		else
		{
			throw new IllegalArgumentException("Invalid bet type");
		}
	}
}
