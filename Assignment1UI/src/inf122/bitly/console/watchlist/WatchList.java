package inf122.bitly.console.watchlist;

import java.util.ArrayList;
import java.util.List;

public class WatchList {
	
	private List<ObserverInterface> observers;
	
	public WatchList()
	{
		observers = new ArrayList<ObserverInterface>();
	}

	public boolean watch(ObserverInterface o) 
	{
		boolean hasObserver = false;
		for (ObserverInterface ob : observers)
			if (o.giveShortURL().equals(ob.giveShortURL()))
				hasObserver = true;
		if (!hasObserver)
			return observers.add(o);
		else
			return false;
	}

	public boolean unwatch(ObserverInterface o) 
	{
		for (ObserverInterface ob : observers)
			if (o.giveShortURL().equals(ob.giveShortURL())) {
				return observers.remove(ob);
			}
		return false;
	}
	
	public int size()
	{
		return observers.size();
	}
	
	public void hours()
	{
		for (ObserverInterface o : observers)
			System.out.println(o.hour());
	}
	
	public void weeks()
	{
		for (ObserverInterface o : observers)
			System.out.println(o.week());
	}

}
