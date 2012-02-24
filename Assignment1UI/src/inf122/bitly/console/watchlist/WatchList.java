package inf122.bitly.console.watchlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		ArrayList<String> observersList = new ArrayList<String>();
		for (ObserverInterface o : observers)
			observersList.add(o.hour());
		Collections.sort(observersList, new NewComparator());
		for (String s : observersList)
			System.out.println(s);
	}
	
	public void weeks()
	{
		ArrayList<String> observersList = new ArrayList<String>();
		for (ObserverInterface o : observers)
			observersList.add(o.week());
		Collections.sort(observersList, new NewComparator());
		for (String s : observersList)
			System.out.println(s);
	}

	
	private class NewComparator implements Comparator<String>
	{
		@Override
		public int compare(String o1, String o2) {
			int tempInt = o1.compareTo(o2);
			if (tempInt > 0)
				return -1;
			if (tempInt < 0)
				return 1;
			else
				return 0;
		}
		
	}
}
