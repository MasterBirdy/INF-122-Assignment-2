package inf122.bitly.console.commands;

import static org.junit.Assert.*;
import inf122.bitly.console.reader.MockTextReaderTrue;
import inf122.bitly.console.state.BitlyContext;

import org.junit.Before;
import org.junit.Test;

public class StopCommandTest {
	
	private BitlyContext bc;
	private StopCommand sc;
	
	@Before
	public void createContext(){
		bc = new BitlyContext(new MockTextReaderTrue());
		sc = new StopCommand();
	}

	@Test
	public void testExecute() {
		assertEquals("Goodbye", sc.execute(bc).getConsoleOutput().get(0));
	}

}
