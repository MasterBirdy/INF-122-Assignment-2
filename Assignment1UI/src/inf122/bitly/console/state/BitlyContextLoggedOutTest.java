package inf122.bitly.console.state;

import static org.junit.Assert.*;

import inf122.bitly.console.reader.MockTextReaderFalse;
import inf122.bitly.console.reader.MockTextReaderTrue;
import inf122.bitly.console.reader.MockXMLReader;
import inf122.bitly.console.watchlist.Observer;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

public class BitlyContextLoggedOutTest {
	
	public BitlyContext context;
	public BitlyContext context2;

	@Before
	public void createScoreboard()
	{
		context = new BitlyContext(new MockTextReaderTrue());
		context2 = new BitlyContext(new MockTextReaderFalse());
	}
	
	@Test(expected = AlreadyLoggedOutException.class)
	public void alreadyLoggedOut()
	{
		context.logout();
	}
	
	@Test(expected = NotLoggedInException.class)
	public void mustBeLoggedInToShorten()
	{
		context.shorten("http://www.google.com");
	}
	
	@Test(expected = NotLoggedInException.class)
	public void mustBeLoggedInToExpand()
	{
		context.expand("http://bit.ly/wLewii");
	}
	
	@Test(expected = NotLoggedInException.class)
	public void mustBeLoggedInToWatch()
	{
		context.watch(new Observer("http://bit.ly/wLewii", new MockXMLReader()));
	}
	
	@Test(expected = NotLoggedInException.class)
	public void mustBeLoggedInToUnwatch()
	{
		context.unwatch(new Observer("http://bit.ly/wLewii", new MockXMLReader()));
	}
	
	@Test(expected = NotLoggedInException.class)
	public void mustBeLoggedInToHour()
	{
		context.hour();
	}
	
	@Test(expected = NotLoggedInException.class)
	public void mustBeLoggedInToWeek()
	{
		context.week();
	}
	
	@Test
	public void loginTrue()
	{
		try {
			assertTrue(context.login("test","123"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void loginFalse()
	{
		try {
			assertEquals(false, context2.login("test","123"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(expected = NotLoggedInException.class)
	public void cantGetWatchlistSize()
	{
		context.sizeOfWatchlist();
	}
	
}


