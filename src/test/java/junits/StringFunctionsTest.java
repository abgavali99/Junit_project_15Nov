package junits;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
	
	@Test
	@DisplayName("Positive Test")
	public void test1() {
		
		assertTrue(StringFunctions.isPalindrome("oppo"));
	}
	
	//@Disabled
	/*@Tag("Sanity")
	@Test
	@DisplayName("Negative Test")*/
	@CustomAnnotation
	public void test2() {
		
		assertFalse(StringFunctions.isPalindrome("abcd"));
	}

}
