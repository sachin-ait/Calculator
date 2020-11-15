package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase; //Added import

class TryTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}

public class CalculatorTest extends TestCase { //New Class for all tests
  Calculator cal=new Calculator();
  
   public CalculatorTest(String name) {
   super(name);
   }
 	public void testSumPosNum() { //User story CAL1 a acceptance criteria
   assertEquals(2,cal.sum(1,1));
  }
	public void testSumNegNum() { //User story CAL1 b acceptance criteria
   assertEquals(-2,cal.sum(-4,-2));
  }
	public void testSumMixNum() { //User story CAL1 c acceptance criteria
   assertEquals(5,cal.sum(15,-10));
  }
	public void testSubPosNum() { //User story CAL2 a acceptance criteria
   assertEquals(-1,cal.sub(5,4));
  }
	public void testSubNegNum() { //User story CAL2 b acceptance criteria
   assertEquals(3,cal.sub(-3,-6));
  }
	public void testSubMixNum() { //User story CAL2 c acceptance criteria
   assertEquals(21,cal.sub(14,-7));
  }
	public void testMulPosNum() { //User story CAL3 a acceptance criteria
   assertEquals(9,cal.mul(3,3));
  }
	public void testMulNegNum() { //User story CAL3 b acceptance criteria
   assertEquals(4,cal.mul(-2,-2));
  }
	public void testMulMixNum() { //User story CAL3 c acceptance criteria
   assertEquals(-8,cal.mul(-4,2));
  }
	public void testDivPosNum() { //User story CAL4 a acceptance criteria
   assertEquals(6,cal.div(12,2));
  }
	public void testDivNegNum() { //User story CAL4 b acceptance criteria
   assertEquals(20,cal.div(-40,-2));
  }
	public void testDivMixNum() { //User story CAL4 c acceptance criteria
   assertEquals(-13,cal.div(-26,2));
  }
}
