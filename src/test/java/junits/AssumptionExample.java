package junits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import  static org.junit.jupiter.api.Assumptions.assumeTrue;
public class AssumptionExample {
	
	
	@BeforeEach
	public void setup() {
		System.setProperty("Env", "Dev");
		
	}
	
	@Test
	public void test1() {
		
		
		String ExpectedEnv="Dev";
		String ActualEnv=System.getProperty("Env");
		
		assumeTrue(ExpectedEnv.equals(ActualEnv));
		assertTrue(StringFunctions.isPalindrome("oppo"));
		
	}

}
