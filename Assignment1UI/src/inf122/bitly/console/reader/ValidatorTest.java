package inf122.bitly.console.reader;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidatorTest {

	@Test
	public void testValidateShortURL1() {
		assertTrue(Validator.validateShortURL("http://bit.ly"));
	}

	@Test
	public void testValidateShortURL2() {
		assertTrue(Validator.validateShortURL("http://bitly.com/awrs3"));
	}
	
	@Test
	public void testValidateShortURL3() {
		assertTrue(Validator.validateShortURL("http://j.mp/zxw323"));
	}
}
