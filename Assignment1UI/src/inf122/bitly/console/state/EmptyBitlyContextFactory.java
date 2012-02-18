// EmptyRacetrackStateFactory.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Creates a new, empty RacetrackState and returns it.

package inf122.bitly.console.state;


public class EmptyBitlyContextFactory implements BitlyContextFactory
{
	public BitlyContext create()
	{
		// Inf122TBD: You will need to implement this method to create a single
		// object that holds all of the state of the racetrack.
		
		return new BitlyContext();
	}
}
