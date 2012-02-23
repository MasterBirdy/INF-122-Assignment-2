package inf122.bitly.console.state;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;

import inf122.bitly.console.reader.MockTextReaderTrue;
import inf122.bitly.console.reader.MockXMLReader;
import inf122.bitly.console.watchlist.Observer;

import org.junit.Before;
import org.junit.Test;

public class BitlyContextLoggedInTest {
	
	public BitlyContext context;
	
	@Before
	public void createLoggedInContext()
	{
		context = new BitlyContext(new MockTextReaderTrue());
		try {
			context.login("user", "123");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(expected = AlreadyLoggedInException.class)
	public void testLoginError()
	{
		try {
			context.login("user", "123");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(expected = AlreadyLoggedOutException.class)
	public void testLogout()
	{
		context.logout();
		context.logout();
	}


	@Test
	public void testShorten()
	{
		assertEquals("http://bit.ly/wLewii",context.shorten("http://tf2pug.heroku.com/topics/3073"));
	}
	
	@Test
	public void testExpand()
	{
		assertEquals("http://tf2pug.heroku.com/topics/3073", context.expand("http://bit.ly/wLewii")); 
	}
	
	@Test
	public void testWatch()
	{
		context.watch(new Observer("http://bit.ly/wLewii", new MockXMLReader()));
		assertEquals(1, context.sizeOfWatchlist());
	}
	
	@Test
	public void TestWatch2()
	{
		context.watch(new Observer("http://bit.ly/wLewii", new MockXMLReader()));
		context.watch(new Observer("http://bit.ly/wLewii", new MockXMLReader()));
		assertEquals(1, context.sizeOfWatchlist());
	}
	
	@Test
	public void TestWatch3()
	{
		context.watch(new Observer("http://www.google.com", new MockXMLReader()));
		assertEquals(0, context.sizeOfWatchlist());
	}
	
	@Test
	public void testUnwatch()
	{
		context.watch(new Observer("http://bit.ly/wLewii", new MockXMLReader()));
		context.unwatch(new Observer("http://bit.ly/wLewii", new MockXMLReader()));
		assertEquals(0, context.sizeOfWatchlist());
	}
	
	@Test
	public void testUnwatch2()
	{
		context.watch(new Observer("http://bit.ly/wLewii", new MockXMLReader()));
		context.unwatch(new Observer("http://bit.ly/wLrdwf", new MockXMLReader()));
		assertEquals(1, context.sizeOfWatchlist());
	}

}
