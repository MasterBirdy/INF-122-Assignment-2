// SingleHorseBetCommand

package inf122.horses.console.commands;

import java.util.Set;


public abstract class SingleHorseBetCommand implements Command
{
	public SingleHorseBetCommand(int horseNumber, int amountPerHorse, Set<String> horseNumbers)
	{
		this.horseNumber = horseNumber;
		this.amountPerHorse = amountPerHorse;
		this.horseNumbers = horseNumbers;
	}
	
	
	protected int getHorseNumber()
	{
		return horseNumber;
	}
	
	
	protected int getAmountPerHorse()
	{
		return amountPerHorse;
	}
	
	
	protected Set<String> getHorseNumbers()
	{
		return horseNumbers;
	}
	
	
	private int horseNumber;
	private int amountPerHorse;
	private Set<String> horseNumbers;
}
