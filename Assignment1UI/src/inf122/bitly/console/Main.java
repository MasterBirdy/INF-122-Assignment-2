// Main.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Provides a main() method for executing the console-mode user interface
// for exercising the engine of the racetrack management system.

package inf122.bitly.console;

import inf122.bitly.console.io.ConsoleCommandStreamsFactory;
import inf122.bitly.console.state.EmptyBitlyContextFactory;


public class Main
{
	public static void main(String[] args)
	{
		new BitlyConsole(
			new EmptyBitlyContextFactory(),
			new ConsoleCommandStreamsFactory())
			.run();
	}
	
}
