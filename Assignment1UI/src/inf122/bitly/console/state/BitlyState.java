package inf122.bitly.console.state;

import inf122.bitly.console.reader.TextReader;

import java.io.IOException;
import java.net.MalformedURLException;

public abstract class BitlyState {
	
	protected TextReader tr;
	
	public BitlyState()
	{
		tr = new TextReader();
	}
	
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
	
	public boolean watch(String shortenedUrl)
	{
		throw new NotLoggedInException();
	}
	
	public boolean unwatch(String shortURL) 
	{
		throw new NotLoggedInException();
	}
	
	public String hour()
	{
		throw new NotLoggedInException();
	}
	
	public String week()
	{
		throw new NotLoggedInException();
	}
	
	public String getLoginName()
	{
		throw new NotLoggedInException();
	}
	
	public String getAPIKey()
	{
		throw new NotLoggedInException();
	}
	
	public static final String MASTER_USERNAME = "masterbirdy";
	public static final String MASTER_API_KEY = "R_fa9db7ada9c06caf5ca2301ff479b3d0";
	public static final String TEXT_FORMAT = "txt";
	public static final String XML_FORMAT = "xml";

}
