package inf122.bitly.console.commands;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;

import inf122.bitly.console.reader.MockTextReaderFalse;
import inf122.bitly.console.reader.MockTextReaderTrue;
import inf122.bitly.console.state.BitlyContext;

import org.junit.Before;
import org.junit.Test;

public class ShortenCommandTest {

	private BitlyContext bc;
	private ShortenCommand sc;
	
	@Before
	public void createContext(){
		bc = new BitlyContext(new MockTextReaderTrue());
		sc = new ShortenCommand("http://tf2pug.heroku.com/topics/3073");
		try {
			bc.login("abc", "123");
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
		assertEquals("URL has been shortened to http://bit.ly/wLewii", sc.execute(bc).getConsoleOutput().get(0));
	}

}
