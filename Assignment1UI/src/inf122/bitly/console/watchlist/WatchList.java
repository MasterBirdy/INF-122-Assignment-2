package inf122.bitly.console.watchlist;

import java.util.ArrayList;
import java.util.List;

public class WatchList {
	
	private List<String> observers;
	
	public WatchList()
	{
		observers = new ArrayList<String>();
	}

	public boolean watch(String shortURL) 
	{
		if (!observers.contains(shortURL))
			return observers.add(shortURL);
		else
			return false;
	}

	public boolean unwatch(String shortURL) 
	{
		return observers.remove(shortURL);
	}

}
