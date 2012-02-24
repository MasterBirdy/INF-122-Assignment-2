package inf122.bitly.console.parsers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LoginCommandParserTest {

	private LoginCommandParser lcp;
	
	@Before
	public void setUp() {
		lcp = new LoginCommandParser();
	}

	@Test
	public void testParseWords() {
		lcp.parseWords(new String[] {"LOGIN", "abc", "123"});
		assertTrue(true);
	}
	
	@Test(expected = InvalidCommandException.class)
	public void parseFailure() {
		lcp.parseWords(new String[] {"LOGIN"});
	}

	@Test
	public void testGetFormatMessages() {
		assertArrayEquals(new String[] {
				"LOGIN <login_name> <apikey>",
				"     login_name - an username for the bit.ly API",
				"     apikey - an api key which you get from bit.ly to run commands"
			}, lcp.getFormatMessages());
	}

}
