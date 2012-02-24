package inf122.bitly.console.reader;

import inf122.bitly.console.state.BitlyState;
import inf122.bitly.console.state.LoggedInBitlyState;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

public class XMLReader implements XMLReaderInterface{
	
	public int parseHour(String shortURL)
	{
		try
		{
			URL hourURL = new URL("http://api.bit.ly/v3/clicks_by_minute?login=" + LoggedInBitlyState.getLoginName() + "&apiKey=" + 
					LoggedInBitlyState.getAPIKey() + "&shortUrl=" + shortURL + "&format=" + BitlyState.XML_FORMAT);
			return parseValue(hourURL);
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	
	public int parseWeek(String shortURL)
	{
		try
		{
			URL weekURL = new URL("http://api.bit.ly/v3/clicks_by_day?login=" + LoggedInBitlyState.getLoginName() + "&apiKey=" + 
					LoggedInBitlyState.getAPIKey() + "&shortUrl=" + shortURL + "&format=" + BitlyState.XML_FORMAT);
			return parseValue(weekURL);
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		return 0;
	}

	private int parseValue (URL shortURL) {

		int totalValue = 0;
		try
		{
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();		
			InputStream stream = shortURL.openStream();
			Document doc = dBuilder.parse(stream);
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("clicks");
			for (int temp = 0; temp < nList.getLength(); temp++) 
			{
				Element nElement = (Element) nList.item(temp);
				NodeList textList = nElement.getChildNodes();
				if (textList.item(0).getNodeValue() != null) 
				{	
					String s = textList.item(0).getNodeValue();
					totalValue += Integer.parseInt(s);
				}
			}
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return totalValue;
	}
}
