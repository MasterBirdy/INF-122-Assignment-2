// RacetrackStateFactory.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Isolates the decision about how RacetrackStates are created/loaded.

package inf122.horses.console.state;


public interface RacetrackStateFactory
{
	RacetrackState create();
}
