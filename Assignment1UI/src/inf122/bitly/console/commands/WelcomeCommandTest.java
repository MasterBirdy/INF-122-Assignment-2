package inf122.bitly.console.commands;

import static org.junit.Assert.*;
import inf122.bitly.console.reader.MockTextReaderTrue;
import inf122.bitly.console.state.BitlyContext;

import org.junit.Before;
import org.junit.Test;

public class WelcomeCommandTest {

	private BitlyContext bc;
	private WelcomeCommand wc;
	
	@Before
	public void createContext(){
		bc = new BitlyContext(new MockTextReaderTrue());
		wc = new WelcomeCommand();
	}

	@Test
	public void testExecute() {
		assertEquals("Informatics 122 Winter 2012 - Assignment #2 - READY", wc.execute(bc).getConsoleOutput().get(0));
	}

}
