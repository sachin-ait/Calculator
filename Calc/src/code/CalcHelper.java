package code;

import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalcHelper {

	// Operators
	static String PLUS = "+";
	static String MINUS = "-";
	static String MULT_1 = "*";
	static String MULT_2 = "x";
	static String DIV = "/";
	static String MODULS = "%";
	static String O_PARA = "(";
	static String C_PARA = ")";
	static String POWER = "^";
	// -------Operators end

	static Pattern TOKEN_PATTERN = Pattern.compile("-?\\d*\\.\\d+|-?\\d+\\.\\d*|-?\\d+|[^A-Za-z0-9\\w\\s]");
	static Pattern NUMERIC_PATTERN = Pattern.compile("-?\\d*\\.\\d+|-?\\d+\\.\\d*|-?\\d+");
	static Pattern OPERATOR_PATTERN = Pattern.compile("-?\\d*\\.\\d+|-?\\d+\\.\\d*|-?\\d+|[^A-Za-z0-9\\w\\s]");

	public static void main(String[] args) {
		CalcHelper helper = new CalcHelper();
//		ArrayList<String> tokens = helper.tokens("2+2*3+2-2*2/2");
//		System.out.println(tokens);
//		tokens= helper.infix_to_postfix(tokens);
//		System.out.println(tokens);
//		System.out.println(helper.calculatePostFix(tokens));
		System.out.println(helper.calc("2+2*2/2"));
	}

	public double calc(String input) {
		ArrayList<String> tokens = tokens(input);
		ArrayList<String> postFix = infix_to_postfix(tokens);
		return calculatePostFix(postFix);
	}

	public ArrayList<String> tokens(String input) {
		ArrayList<String> arr = new ArrayList<String>();
		Matcher matcher = TOKEN_PATTERN.matcher(input);
		String parent = null;
		while (matcher.find()) {
			String str = matcher.group();
			if (parent != null && isNum(parent) && isNum(str)) {
				double c = Double.parseDouble(str);
				if (c < 0)
					arr.add("+");
			}
			arr.add(str);
			parent = str;
		}
		return arr;
	}

       // -------scientific calculator start
       // ------- 1. user input a number( Or the result of several other calculations)  2.click sin,cos,tan,log will get a result
    public static Double sinCal(String input) throws Exception {
        if (!TOKEN_PATTERN.matcher(input).matches()) {
            throw new Exception("illegal number");
        }
        return Math.sin(Double.parseDouble(input));
    }

    public static Double cosCal(String input) throws Exception {
        if (!TOKEN_PATTERN.matcher(input).matches()) {
            throw new Exception("illegal number");
        }
        return Math.cos(Double.parseDouble(input));
    }

    public static Double tancal(String input) throws Exception {
        if (!TOKEN_PATTERN.matcher(input).matches()) {
            throw new Exception("illegal number");
        }
        return Math.tan(Double.parseDouble(input));
    }

    public static Double logcal(String input) throws Exception {
        if (!TOKEN_PATTERN.matcher(input).matches()) {
            throw new Exception("illegal number");
        }
        return Math.log(Double.parseDouble(input));
    }
       // -------scientific calculator end
	public ArrayList<String> infix_to_postfix(ArrayList<String> inputArray) {
		ArrayList<String> out = new ArrayList<String>();
		Stack<String> operStack = new Stack<String>();
		for (String token : inputArray) {
			if (isNum(token)) {
				out.add(token);
			} else {
				pushOper(operStack, token, out);
			}
		}
		while (!operStack.isEmpty())
			out.add(operStack.pop());
		return out;
	}

	public boolean isNum(String str) {
		return NUMERIC_PATTERN.matcher(str).matches();
	}

	public boolean isOperator(String str) {
		return OPERATOR_PATTERN.matcher(str).matches();
	}

	public void pushOper(Stack<String> stk, String oper, ArrayList<String> out) {
		int priority_current = priority(oper);
		if (stk.isEmpty() || O_PARA.contentEquals(oper) || stk.peek().contentEquals(O_PARA)) {
			stk.push(oper);
			return;
		}
		if (priority(stk.peek()) < priority_current) {
			stk.push(oper);
			return;
		} else {
			if (!oper.contentEquals(C_PARA)) {
				while (!stk.isEmpty() && (priority(stk.peek()) >= priority_current || oper.contentEquals(O_PARA)))
					out.add(stk.pop());
				stk.push(oper);
			} else {
				while (!stk.peek().contentEquals(O_PARA))
					out.add(stk.pop());
				stk.pop();
			}
		}

	}

	public double calculatePostFix(ArrayList<String> input) {
		Stack<Double> stack = new Stack<Double>();
		for (String string : input) {
			if (isNum(string))
				stack.push(Double.parseDouble(string));
			else {
				double num2 = stack.pop();
				double num1 = stack.pop();
				stack.push(operation(num1, num2, string));
			}
		}
		return stack.pop();
	}

	public int priority(String oper) {
		if (PLUS.contentEquals(oper) || MINUS.contentEquals(oper))
			return 1;
		if (DIV.contentEquals(oper) || MODULS.contentEquals(oper) || MULT_1.contentEquals(oper)
				|| MULT_2.contentEquals(oper))
			return 2;
		if (POWER.contentEquals(oper))
			return 3;
		return 0;
	}

	public double operation(double num1, double num2, String oper) {
		if (PLUS.contentEquals(oper))
			return num1 + num2;
		if (MINUS.contentEquals(oper))
			return num1 - num2;
		if (MULT_1.contentEquals(oper) || MULT_2.contentEquals(oper))
			return num1 * num2;
		if (DIV.contentEquals(oper))
			return num1 / num2;
		if (MODULS.contentEquals(oper))
			return num1 % num2;
		if (POWER.contentEquals(oper))
			return Math.pow(num1, num2);

		return 0;
	}
}
