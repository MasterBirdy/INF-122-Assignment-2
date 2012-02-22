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
	
	public boolean login(String loginName, String apiKey) throws MalformedURLException, IOException 
	{
		BitlyState tempState = state.login(loginName, apiKey);
		if (tempState.getLoginName().equals("") || tempState.getAPIKey().equals(""))
			return false;
		else
		{
			state = tempState;
			return true;
		}
	}

	public void logout()
	{
		state.logout();
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
