package junits;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.DynamicTest;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Arrays;
import java.util.Collection;
public class DynamicTestExamples {
	
	@TestFactory
	public  Collection<DynamicTest> method1() {
		
	return	Arrays.asList(
		
	DynamicTest.dynamicTest("Positive Test1", 
			() ->assertTrue(StringFunctions.isPalindrome("oppo"))),
	
	DynamicTest.dynamicTest("Positive Test2", 
			() ->assertTrue(StringFunctions.isPalindrome("madam"))),
	
	
	DynamicTest.dynamicTest("Negative Test", 
			() ->assertFalse(StringFunctions.isPalindrome("abcd")))
		
	);
		
	}

   

}
