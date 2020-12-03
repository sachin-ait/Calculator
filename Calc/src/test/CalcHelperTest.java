package test;

import junit.framework.TestCase;

import org.junit.Test;

import code.CalcHelper;

public class CalcHelperTest extends TestCase {

	// input 2+2*2/2
	// Expect result 4.0
	public void testCalc001() {
		CalcHelper calcHelper = new CalcHelper();
		String input = "2+2*2/2";
		try {
			double calc = calcHelper.calc(input);
			System.out.println(calc);
			assertEquals(4.0, calc);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	// input -5 * -3 * 2 + 6 - 2
	// Expect result 34.0
	public void testCalc002() {
		CalcHelper calcHelper = new CalcHelper();
		String input = "-5 * -3 * 2 + 6 - 2";
		try {
			double calc = calcHelper.calc(input);
			System.out.println(calc);
			assertEquals(34.0, calc);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	// input sin(90)
	// Expect result 1.0
	public void testCalc010() {
		CalcHelper calcHelper = new CalcHelper();
		String input = "sin(90)";
		try {
			double calc = calcHelper.calc(input);
			System.out.println(calc);
			assertEquals(1.0, calc);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	// input cos(90)
	// Expect result 0.0
	public void testCalc011() {
		CalcHelper calcHelper = new CalcHelper();
		String input = "cos(90)";
		try {
			double calc = calcHelper.calc(input);
			System.out.println(calc);
			assertEquals(0.0, calc);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	// input tan(0)
	// Expect result 0.0
	public void testCalc012() {
		CalcHelper calcHelper = new CalcHelper();
		String input = "tan(0)";
		try {
			double calc = calcHelper.calc(input);
			System.out.println(calc);
			assertEquals(0.0, calc);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	//input "2+sin(45)"
	//output 2.71
	@Test
	public void testcalc013()
	{
		CalcHelper helper= new CalcHelper();
		String inString= "2+sin(45)";
		try {
			double calc = helper.calc(inString);
			System.out.println(calc);
			assertEquals(2.71, calc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//input "2+cos(45)+tan(45)"
	//output 3.71
	@Test
	public void testcalc014()
	{
		CalcHelper helper= new CalcHelper();
		String inString= "2+cos(45)+tan(45)";
		try {
			double calc = helper.calc(inString);
			System.out.println(calc);
			assertEquals(3.71, calc);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	//input "2+cos(45)+tan(45)+sin(-180)"
	//output 3.71
	@Test
	public void testcalc015()
	{
		CalcHelper helper= new CalcHelper();
		String inString= "2+cos(45)+tan(45)+sin(-180)";
		try {
			double calc = helper.calc(inString);
			System.out.println(calc);
			assertEquals(3.71, calc);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	//input "2*2(4+5)"
	//output 36
	@Test
	public void testcalc016()
	{
		CalcHelper helper= new CalcHelper();
		String inString= "2*2*(4+5)";
		try {
			double calc = helper.calc(inString);
			System.out.println(calc);
			assertEquals(36.0, calc);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	//input "2*2(4+5*3)-12"
	//output 36
	@Test
	public void testcalc017()
	{
		CalcHelper helper= new CalcHelper();
		String inString= "2*2*(4+5)";
		try {
			double calc = helper.calc(inString);
			System.out.println(calc);
			assertEquals(36.0, calc);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	//input "cos(45+45)"
	//output 0.0
	@Test
	public void testcalc018()
	{
		CalcHelper helper= new CalcHelper();
		String inString= "cos(45+45)";
		try {
			double calc = helper.calc(inString);
			System.out.println(calc);
			assertEquals(0.0, calc);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	//input "cos(2*(40+5))"
	//output 0.0
	@Test
	public void testcalc019()
	{
		CalcHelper helper= new CalcHelper();
		String inString= "cos(2*(40+5))";
		try {
			double calc = helper.calc(inString);
			System.out.println(calc);
			assertEquals(0.0, calc);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	//input "cos(0+sin(0))"
	//output 1.0
	@Test
	public void testcalc020()
	{
		CalcHelper helper= new CalcHelper();
		String inString= "cos(0+sin(0))";
		try {
			double calc = helper.calc(inString);
			System.out.println(calc);
			assertEquals(1.0, calc);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	//input "cos(2*(40+5)"
	//output invalid expression
	@Test
	public void testcalc021()
	{
		CalcHelper helper= new CalcHelper();
		String inString= "cos(2*(40+5)";
		try {
			double calc = helper.calc(inString);
			System.out.println(calc);
			fail();
		} catch (Exception e) {
			assertEquals("Invalid Expression", e.getMessage());
		}
	}
}