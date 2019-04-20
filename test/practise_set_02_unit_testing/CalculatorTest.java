package practise_set_02_unit_testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * @author apurba
 *
 */
public class CalculatorTest {

	@Test
	public void testAddIntInt() {
		Calculator cal = new Calculator();
		int a = 6;
		int b = 7;
		
		int actual = cal.add(a, b);
		
		assertEquals(13, actual);
	}
	
	@Test
	public void testAddIntArray() {
		Calculator cal = new Calculator();
		int[] array = {1, 2, 3, 4, 5};
		
		int actual = cal.add(array);
		
		org.junit.Assert.assertEquals(15, actual);
	}
}
