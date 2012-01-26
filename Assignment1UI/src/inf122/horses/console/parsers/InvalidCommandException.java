package inf122.horses.console.parsers;


public class InvalidCommandException extends RuntimeException
{
	public InvalidCommandException(String message)
	{
		super(message);
	}
}
