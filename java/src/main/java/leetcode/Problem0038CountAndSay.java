/**
 * 
 */
package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 */
public class Problem0038CountAndSay {
	private static final Logger logger = LogManager.getLogger(Problem0038CountAndSay.class);

	private Problem0038CountAndSay() {

	}

	public static String countAndSay(int n) {
		logger.info("Input number: {}", n);

		if (n == 0)
			return "";

		String s = "1";

		for (int i = 1; i < n; i++) {
			s = nextString(s);
			logger.info("Value at length {} is {}", i + 1, s);
		}

		return s;
	}

	/**
	 * @param s
	 * @return
	 */
	private static String nextString(String s) {
		StringBuilder result = new StringBuilder();
		char[] charArray = s.toCharArray();
		char value = s.charAt(0);
		int count = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (value == charArray[i]) {
				count++;
			} else {
				result.append(count);
				result.append(value);
				value = charArray[i];
				count = 1;
			}
		}

		if (count != 0) {
			result.append(count);
			result.append(value);
		}

		return result.toString();
	}
}
