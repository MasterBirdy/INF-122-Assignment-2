// ConsoleCommandOutputStream.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Writes command output to the console (i.e., System.out)

package inf122.bitly.console.io;


class ConsoleCommandOutputStream implements CommandOutputStream
{
	public void writeOutput(String outputLine)
	{
		System.out.println(outputLine);
	}
}
