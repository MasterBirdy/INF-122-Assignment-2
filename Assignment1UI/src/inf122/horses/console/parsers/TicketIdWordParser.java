package inf122.horses.console.parsers;


public class TicketIdWordParser extends RangedIntegerWordParser
{
	public TicketIdWordParser()
	{
		super(0, Integer.MAX_VALUE);
	}
}
