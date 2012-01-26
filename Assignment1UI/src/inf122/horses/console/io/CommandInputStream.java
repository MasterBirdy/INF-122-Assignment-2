// CommandInputStream.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// This interface hides the notion of where commands are coming from,
// meaning they could come from the console (as they will in our
// program here), from sockets, etc.

package inf122.horses.console.io;


public interface CommandInputStream
{
	String nextCommandString();
}
