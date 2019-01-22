import java.util.Stack;

/**
 * Artem Voytenko
 * 22.01.2019
 */

public class Utils {
	public static boolean bracketsOk(String str) {
		Stack<Character> stack = new Stack<>();
		boolean result = false;

		for (int i = 0; i < str.length(); i++) {
			char symb = str.charAt(i);
			if (symb == '[' || symb == '{' || symb == '(') {
				stack.push(symb);
				result = false;
			} else if (symb == ']' || symb == '}' || symb == ')') {
				if (!stack.isEmpty()) {
					Character fromStack = stack.pop();
					if ((fromStack == '[' && symb == ']') ||
							(fromStack == '{' && symb == '}') ||
							(fromStack == '(') && symb == ')') {
						if (stack.isEmpty()) result = true;
					}
				} else {
					result = false;
					break;
				}
			}
		}
		return result;
	}
}
