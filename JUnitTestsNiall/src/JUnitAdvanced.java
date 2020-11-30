import java.lang.Math;
import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;
// All methods return numbers rounded up, therefore JUnit tests fail but the calculation is correct
public class JUnitAdvanced extends TestCase {
	double sin(double doub1) {
		//double rad = Math.toRadians(doub1);
		return Math.sin(doub1);
	}
	double cos(double doub1) {
		//double rad = Math.toRadians(doub1);
		return Math.cos(doub1);
	}
	double tan(double doub1) {
		//double rad = Math.toRadians(doub1);
		return Math.tan(doub1);
	}
	double root(double doub1) {
		return Math.sqrt(doub1);
	}
}
