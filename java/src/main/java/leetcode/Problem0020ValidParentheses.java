package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * @author mmcgarg
 *
 *         link: https://leetcode.com/problems/valid-parentheses
 */
public class Problem0020ValidParentheses {

	public static boolean isValid(String s) {
		boolean valid = true;

		Set<Character> opening = new HashSet<>();
		opening.add('{');
		opening.add('[');
		opening.add('(');

		Set<Character> closing = new HashSet<>();
		closing.add(']');
		closing.add('}');
		closing.add(')');

		Map<Character, Character> combination = new HashMap<>();
		combination.put(']', '[');
		combination.put('}', '{');
		combination.put(')', '(');

		Stack<Character> stack = new Stack<>();

		if (s.length() != 0) {
			for (int i = 0; i < s.length(); i++) {
				char charAtI = s.charAt(i);
				if (opening.contains(charAtI)) {
					stack.add(charAtI);
				} else if (closing.contains(charAtI) && !stack.isEmpty()) {
					Character pop = stack.pop();
					if (!pop.equals(combination.get(charAtI))) {
						return false;
					}
				} else {
					return false;
				}
			}
		}

		if (!stack.isEmpty()) {
			valid = false;
		}

		return valid;

	}
}
