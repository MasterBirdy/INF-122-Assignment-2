package inf122.bitly.console.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import inf122.bitly.console.state.BitlyState;

public class TextReader {

	public String login(String loginName, String apiKey){
		try 
		{
			URL loginURL = new URL("http://api.bit.ly/v3/validate?x_login=" + BitlyState.MASTER_USERNAME 
					+ "&x_apiKey=" + BitlyState.MASTER_API_KEY + "&login=" + loginName + "&apiKey=" + 
					apiKey + "&format=" + BitlyState.TEXT_FORMAT);
			return parse(loginURL);
		} 
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		return "";
	}
	
	public String shorten(String longURL, String loginName, String apiKey) {
		try 
		{
			URL shortenURL = new URL("http://api.bit.ly/v3/shorten?login=" + loginName + "&apiKey=" + 
					apiKey + "&longUrl=" + longURL + "&format=" + BitlyState.TEXT_FORMAT);
			return parse(shortenURL);
		} 
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		return "";
	}
	
	public String expand(String shortURL, String loginName, String apiKey) {
		try 
		{
			URL shortenURL = new URL("http://api.bit.ly/v3/expand?login=" + loginName + "&apiKey=" + 
					apiKey + "&shortUrl=" + shortURL + "&format=" + BitlyState.TEXT_FORMAT);
			return parse(shortenURL);
		} 
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		return "";
	}

	private String parse(URL u){
		URLConnection loginURLc;
		try 
		{
			loginURLc = u.openConnection();
			BufferedReader in = new BufferedReader(
					new InputStreamReader(loginURLc.getInputStream()));
			String inputLine = in.readLine();
			return inputLine;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return "";

	}
	
}
