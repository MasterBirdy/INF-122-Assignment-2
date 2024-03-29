package inf122.bitly.console.watchlist;

import inf122.bitly.console.reader.XMLReaderInterface;

public class Observer implements ObserverInterface {
	
	private String shortURL;
	private XMLReaderInterface xmlr;
	
	public Observer (String s, XMLReaderInterface xmlr)
	{
		shortURL = s;
		this.xmlr = xmlr;
	}

	@Override
	public String hour() 
	{
		return xmlr.parseHour(shortURL) + " clicks" + " - " + shortURL;
	}

	@Override
	public String week() 
	{
		return xmlr.parseWeek(shortURL) + " clicks" + " - " + shortURL;
	}

	@Override
	public String giveShortURL() 
	{
		return shortURL;
	}

}
