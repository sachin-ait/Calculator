import junit.framework.TestCase;

public class JUnitAdvancedTest extends TestCase {
	public void testSin001(){
		JUnitAdvanced c = new JUnitAdvanced();
		assertEquals(0.14112000806, c.sin(3.0));
	}
	public void testCos001(){
		JUnitAdvanced c = new JUnitAdvanced();
		assertEquals(-0.9899924966, c.cos(3.0));
	}
	public void testTan001(){
		JUnitAdvanced c = new JUnitAdvanced();
		assertEquals(-0.14254654307, c.tan(3.0));
	}
	public void testRoot001(){
		JUnitAdvanced c = new JUnitAdvanced();
		assertEquals(1.73205080757, c.root(3.0));
	}
}
