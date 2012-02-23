// RacetrackState.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// A RacetrackState represents an object that holds all of the state necessary
// to run the console-mode user interface.

package inf122.bitly.console.state;

import inf122.bitly.console.reader.TextReaderInterface;
import inf122.bitly.console.watchlist.ObserverInterface;

import java.io.IOException;
import java.net.MalformedURLException;

public class BitlyContext
{
	private BitlyState state;
	
	public BitlyContext(TextReaderInterface tr)
	{
		state = new LoggedOutBitlyState(tr);
	}
	
	public boolean login(String loginName, String apiKey) throws MalformedURLException, IOException 
	{
		BitlyState tempState = state.login(loginName, apiKey);
		if (tempState.loggedIn())
		{
			state = tempState;
			return true;
		}
		else
			return false;
	}
	

	public void logout()
	{
		state = state.logout();
	}

	public String shorten(String longURL) 
	{
		return state.shorten(longURL);
	}
	
	public String expand(String shortURL) 
	{
		return state.expand(shortURL);
	}
	
	public boolean watch(ObserverInterface o)
	{
		return state.watch(o);
	}
	
	public boolean unwatch(ObserverInterface o)
	{
		return state.unwatch(o);
	}
	
	public void hour()
	{
		state.hour();
	}
	
	public void week()
	{
		state.week();
	}
	
	public int sizeOfWatchlist()
	{
		return state.sizeOfWatchlist();
	}
}
