package inf122.bitly.testing;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class testMe {


	public static void main(String[] args) {
		int totalValue = 0;
		try
		{
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();	
			URL shortURL = new URL("http://api.bit.ly/v3/clicks_by_day?login=masterbirdy&apiKey=R_fa9db7ada9c06caf5ca2301ff479b3d0&shortUrl=http://bit.ly/wLewii&format=xml");
			System.out.println(shortURL);
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
		System.out.println(totalValue);
	}


}
