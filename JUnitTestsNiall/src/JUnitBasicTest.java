import junit.framework.TestCase;

public class JUnitBasicTest extends TestCase{
		public void testAddition001(){
			JUnitBasic c = new JUnitBasic();
			assertEquals(6.0, c.addition(3.0, 3.0));
		}
		public void testAddition002(){
			JUnitBasic c = new JUnitBasic();
			assertEquals(0.0, c.addition(3.0, -3.0));
		}
		public void testAddition003(){
			JUnitBasic c = new JUnitBasic();
			assertEquals(-6.0, c.addition(-3.0, -3.0));
		}
		public void testSubtraction001(){
			JUnitBasic c = new JUnitBasic();
			assertEquals(0.0, c.subtraction(3.0, 3.0));
		}
		public void testSubtraction002(){
			JUnitBasic c = new JUnitBasic();
			assertEquals(-6.0, c.subtraction(-3.0, 3.0));
		}
		public void testSubtraction003(){
			JUnitBasic c = new JUnitBasic();
			assertEquals(0.0, c.subtraction(-3.0, -3.0));
		}
		public void testSubtraction004(){
			JUnitBasic c = new JUnitBasic();
			assertEquals(6.0, c.subtraction(3.0, -3.0));
		}
		public void testMultiplication001(){
			JUnitBasic c = new JUnitBasic();
			assertEquals(9.0, c.multiplication(3.0, 3.0));
		}
		public void testMultiplication002(){
			JUnitBasic c = new JUnitBasic();
			assertEquals(-9.0, c.multiplication(3.0, -3.0));
		}
		public void testMultiplication003(){
			JUnitBasic c = new JUnitBasic();
			assertEquals(9.0, c.multiplication(-3.0, -3.0));
		}
		public void testDivision001() {
			JUnitBasic c = new JUnitBasic();
			assertEquals(1.0, c.division(3.0, 3.0));
		}
		public void testDivision002() {
			JUnitBasic c = new JUnitBasic();
			assertEquals(-1.0, c.division(3.0, -3.0));
		}
		public void testDivision003() {
			JUnitBasic c = new JUnitBasic();
			assertEquals(1.0, c.division(-3.0, -3.0));
		}
		public void testDivision004() {
			JUnitBasic c = new JUnitBasic();
			assertEquals(-1.0, c.division(-3.0, 3.0));
		}
}

