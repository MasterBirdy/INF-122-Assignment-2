package inf122.bitly.console.commands;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;

import inf122.bitly.console.reader.MockTextReaderTrue;
import inf122.bitly.console.state.BitlyContext;

import org.junit.Before;
import org.junit.Test;

public class LogoutCommandTest {

	private BitlyContext bc;
	private LogoutCommand lc;
	
	@Before
	public void createContext(){
		bc = new BitlyContext(new MockTextReaderTrue());
		try {
			bc.login("abc", "123");
			lc = new LogoutCommand();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testExecute() {
		assertEquals("Logout successful", lc.execute(bc).getConsoleOutput().get(0));
	}

}
