package inf122.bitly.console.commands;

import static org.junit.Assert.*;
import inf122.bitly.console.reader.MockTextReaderTrue;
import inf122.bitly.console.reader.MockXMLReader;
import inf122.bitly.console.state.BitlyContext;
import inf122.bitly.console.watchlist.Observer;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

public class WeekCommandTest {

	private BitlyContext bc;
	private WeekCommand wc;
	
	@Before
	public void createContext(){
		bc = new BitlyContext(new MockTextReaderTrue());
		try {
			bc.login("abc", "123");
			wc = new WeekCommand();
			bc.watch(new Observer("http://bit.ly/wLewii", new MockXMLReader()));
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
		assertEquals("End of Week List", wc.execute(bc).getConsoleOutput().get(0));
	}

}
