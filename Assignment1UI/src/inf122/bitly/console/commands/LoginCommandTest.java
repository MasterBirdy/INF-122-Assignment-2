package inf122.bitly.console.commands;

import static org.junit.Assert.*;
import inf122.bitly.console.reader.MockTextReaderFalse;
import inf122.bitly.console.reader.MockTextReaderTrue;
import inf122.bitly.console.state.BitlyContext;

import org.junit.Before;
import org.junit.Test;

public class LoginCommandTest {
	
	private BitlyContext bc;
	private BitlyContext bc2;
	private LoginCommand lc;
	
	@Before
	public void createContext(){
		bc = new BitlyContext(new MockTextReaderTrue());
		bc2 = new BitlyContext(new MockTextReaderFalse());
		lc = new LoginCommand("abc", "123");
	}
	@Test
	public void testExecute() {
		assertEquals("You were logged in as: abc with API Key: 123", lc.execute(bc).getConsoleOutput().get(0));
	}
	
	@Test
	public void testExecute2() {
		assertEquals("Login unsuccessful", lc.execute(bc2).getConsoleOutput().get(0));
	}

}
