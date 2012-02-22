package inf122.bitly.console.state;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

public class LoggedOutTest {
	
	public BitlyContext state;

	@Before
	public void createScoreboard()
	{
		state = new BitlyContext();
	}
	
	@Test(expected = AlreadyLoggedOutException.class)
	public void alreadyLoggedOut()
	{
		state.logout();
	}
	
	@Test(expected = NotLoggedInException.class)
	public void mustBeLoggedInToShorten()
	{
		state.shorten("http://www.google.com");
	}
	
	@Test(expected = NotLoggedInException.class)
	public void mustBeLoggedInToExpand()
	{
		state.expand("http://bit.ly/wLewii");
	}
	
	@Test(expected = NotLoggedInException.class)
	public void mustBeLoggedInToWatch()
	{
		state.watch("http://bit.ly/wLewii");
	}
	
	@Test(expected = NotLoggedInException.class)
	public void mustBeLoggedInToUnwatch()
	{
		state.unwatch("http://bit.ly/wLewii");
	}
	
	@Test(expected = NotLoggedInException.class)
	public void mustBeLoggedInToHour()
	{
		state.hour();
	}
	
	@Test(expected = NotLoggedInException.class)
	public void mustBeLoggedInToWeek()
	{
		state.week();
	}
	
	@Test
	public void TestingLoginTrue()
	{
		try {
			assertTrue(state.login("", "", true));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			fail("MalformedURLException");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			fail("IOException");
		}
	}
	
	@Test
	public void TestingLoginFalse()
	{
		try {
			assertEquals(false, state.login("", "", false));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			fail("MalformedURLException");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			fail("IOException");
		}
	}
}


