package inf122.bitly.console.parsers;


public class TicketIdWordParser extends RangedIntegerWordParser
{
	public TicketIdWordParser()
	{
		super(0, Integer.MAX_VALUE);
	}
}
