package test;

import junit.framework.TestCase;
import newcal.CalcHelper;

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

	// input sin(60)
	// Expect result -0.3048106211022167
	public void testCalc010() {
		CalcHelper calcHelper = new CalcHelper();
		String input = "sin(60)";
		try {
			double calc = calcHelper.calc(input);
			System.out.println(calc);
			assertEquals(-0.3048106211022167, calc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// input cos(90)
	// Expect result 4.0
	public void testCalc011() {
		CalcHelper calcHelper = new CalcHelper();
		String input = "cos(90)";
		try {
			double calc = calcHelper.calc(input);
			System.out.println(calc);
			assertEquals(-0.4480736161291702, calc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// input tan(50)
	// Expect result 4.0
	public void testCalc012() {
		CalcHelper calcHelper = new CalcHelper();
		String input = "tan(50)";
		try {
			double calc = calcHelper.calc(input);
			System.out.println(calc);
			assertEquals(-0.27190061199763077, calc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// input tan(50)
	// Expect result 4.0
	public void testCalc013() {
		CalcHelper calcHelper = new CalcHelper();
		String input = "log(30)";
		try {
			double calc = calcHelper.calc(input);
			System.out.println(calc);
			assertEquals(3.4011973816621555, calc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
