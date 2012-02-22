package inf122.bitly.console.state;

import inf122.bitly.console.reader.Validator;
import inf122.bitly.console.watchlist.WatchList;

public class LoggedInBitlyState extends BitlyState {
	
	private String loginName;
	private String apiKey;
	private WatchList watchlist;
	
	public LoggedInBitlyState(String loginName, String apiKey)
	{
		this.loginName = loginName;
		this.apiKey = apiKey;
		this.watchlist = new WatchList();
	}
	
	public String getLoginName()
	{
		return loginName;
	}
	
	public String getAPIKey()
	{
		return apiKey;
	}
	
	public BitlyState logout()
	{
		return new LoggedOutBitlyState();
	}
	
	public String shorten (String longURL)
	{
		return tr.shorten(longURL, loginName, apiKey);
	}
	
	public String expand (String shortURL)
	{
		return tr.expand(shortURL, loginName, apiKey);
	}
	
	public boolean watch(String shortURL)
	{
		if (Validator.validateShortURL(shortURL))
			return watchlist.watch(shortURL);
		else 
			return false;
	}
	
	public boolean unwatch(String shortURL)
	{
		return watchlist.unwatch(shortURL);
	}
}
