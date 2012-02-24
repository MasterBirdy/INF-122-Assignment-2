package inf122.bitly.console.state;

import static org.junit.Assert.*;
import inf122.bitly.console.reader.MockTextReaderTrue;

import org.junit.Before;
import org.junit.Test;

public class LoggedInBitlyStateTest {
	
	private LoggedInBitlyState bitlyState;
	
	@Before
	public void createBitlyStateLoggedIn()
	{
		bitlyState = new LoggedInBitlyState("loginName", "apiKey", new MockTextReaderTrue());
	}

	@Test
	public void testGetLoginName() {
		assertEquals("loginName", LoggedInBitlyState.getLoginName());
	}

	@Test
	public void testGetAPIKey() {
		assertEquals("apiKey", LoggedInBitlyState.getAPIKey());
	}

}
