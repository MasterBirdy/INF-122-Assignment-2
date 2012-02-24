package inf122.bitly.console.state;

import inf122.bitly.console.reader.TextReaderInterface;
import inf122.bitly.console.reader.Validator;
import inf122.bitly.console.watchlist.ObserverInterface;
import inf122.bitly.console.watchlist.WatchList;

public class LoggedInBitlyState extends BitlyState {
	
	private static String loginName;
	private static String apiKey;
	private WatchList watchlist;
	
	public LoggedInBitlyState(String loginName, String apiKey, TextReaderInterface tr)
	{
		LoggedInBitlyState.loginName = loginName;
		LoggedInBitlyState.apiKey = apiKey;
		this.watchlist = new WatchList();
		this.tr = tr;
	}
	
	public BitlyState logout()
	{
		return new LoggedOutBitlyState(tr);
	}
	
	public String shorten (String longURL)
	{
		return tr.shorten(longURL);
	}
	
	public String expand (String shortURL)
	{
		return tr.expand(shortURL);
	}
	
	public boolean watch(ObserverInterface o)
	{
		if (Validator.validateShortURL(o.giveShortURL()))
			return watchlist.watch(o);
		else 
			return false;
	}
	
	public boolean unwatch(ObserverInterface o)
	{
		return watchlist.unwatch(o);
	}
	
	public boolean loggedIn()
	{
		return !(loginName.equals(""));
	}
	
	public int sizeOfWatchlist()
	{
		return watchlist.size();
	}
	
	public static String getLoginName()
	{
		return loginName;
	}
	
	public static String getAPIKey()
	{
		return apiKey;
	}
	
	public void hour()
	{
		watchlist.hours();
	}
	
	public void week()
	{
		watchlist.weeks();
	}
}
