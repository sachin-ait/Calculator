package test;

import junit.framework.TestCase;
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
		}
	}

}