package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionEg {
	
	
	@Test
	public void test() {
		String name1="ram";
		String name2="rohan";	
		//System.out.println("hello");
		assertEquals(name1,name2);
		
		String[] expectedarray= {"one", "two", "three"};
		String[] resultarray= {"one", "two", "three"};
	
		assertEquals(expectedarray,resultarray);
		
		
	}
}
