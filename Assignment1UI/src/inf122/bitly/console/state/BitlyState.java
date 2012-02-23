package inf122.bitly.console.state;

import inf122.bitly.console.reader.TextReaderInterface;
import inf122.bitly.console.watchlist.ObserverInterface;

import java.io.IOException;
import java.net.MalformedURLException;

public abstract class BitlyState {
	
	protected TextReaderInterface tr;
	
	public BitlyState login(String loginName, String apiKey) throws MalformedURLException, IOException
	{
		throw new AlreadyLoggedInException();
	}

	public BitlyState logout()
	{
		throw new AlreadyLoggedOutException();
	}
	
	public String shorten(String url)
	{
		throw new NotLoggedInException();
	}
	
	public String expand(String shortenedUrl)
	{
		throw new NotLoggedInException();
	}
	
	public boolean watch(ObserverInterface o)
	{
		throw new NotLoggedInException();
	}
	
	public boolean unwatch(ObserverInterface o) 
	{
		throw new NotLoggedInException();
	}
	
	public void hour()
	{
		throw new NotLoggedInException();
	}
	
	public void week()
	{
		throw new NotLoggedInException();
	}
	

	public boolean loggedIn()
	{
		return false;
	}
	
	public int sizeOfWatchlist()
	{
		throw new NotLoggedInException();
	}
	
	public static final String MASTER_USERNAME = "masterbirdy";
	public static final String MASTER_API_KEY = "R_fa9db7ada9c06caf5ca2301ff479b3d0";
	public static final String TEXT_FORMAT = "txt";
	public static final String XML_FORMAT = "xml";

}
