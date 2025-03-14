package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mmcgarg
 *
 *         link: https://leetcode.com/problems/roman-to-integer/
 *
 */
class Problem0013RomanToInteger {

	private static final Map<Character, Integer> ROMAN_VALUES = new HashMap<Character, Integer>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
		}
	};

	public static int romanToInt(String s) {
		int returnValue = 0;
		int previousValue = 0;
		int currentValue = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			currentValue = ROMAN_VALUES.get(s.charAt(i));
			if (currentValue >= previousValue) {
				returnValue += currentValue;
			} else {
				returnValue -= currentValue;
			}
			previousValue = currentValue;
		}

		return returnValue;
	}
}