// RacetrackState.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// A RacetrackState represents an object that holds all of the state necessary
// to run the console-mode user interface.

package inf122.bitly.console.state;

import java.io.IOException;
import java.net.MalformedURLException;

public class BitlyContext
{
	private BitlyState state;
	
	public BitlyContext()
	{
		state = new LoggedOutBitlyState();
	}
	
	public boolean login(String loginName, String apiKey, boolean success) throws MalformedURLException, IOException 
	{
		if (success) 
		{
			state = state.login(loginName, apiKey);
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
	
	public boolean watch(String shortURL)
	{
		return state.watch(shortURL);
	}
	
	public boolean unwatch(String shortURL)
	{
		return state.unwatch(shortURL);
	}
	
	public void hour()
	{
		state.hour();
	}
	
	public void week()
	{
		state.week();
	}
}
