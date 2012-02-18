// CommandOutputStream.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// This interface hides information about where command output is sent
// (e.g., the console, a socket, etc.).

package inf122.bitly.console.io;


public interface CommandOutputStream
{
	void writeOutput(String outputLine);
}
