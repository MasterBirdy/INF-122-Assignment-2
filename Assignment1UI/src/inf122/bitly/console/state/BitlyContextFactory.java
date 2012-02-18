// RacetrackStateFactory.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Isolates the decision about how RacetrackStates are created/loaded.

package inf122.bitly.console.state;


public interface BitlyContextFactory
{
	BitlyContext create();
}
