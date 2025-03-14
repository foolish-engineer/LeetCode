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
public class Problem0058LengthOfLastWord {
	private static final Logger logger = LogManager.getLogger(Problem0058LengthOfLastWord.class);

	private Problem0058LengthOfLastWord() {

	}

	public static int lengthOfLastWord(String s) {
		logger.info("Input string: {}", s);
		if (s == null || s.length() == 0)
			return 0;

		char[] charArray = s.toCharArray();
		int start = 0;
		int end = 0;
		boolean validCharFound = false;

		for (int i = charArray.length - 1; i >= 0; i--) {
			if (charArray[i] == ' ' && validCharFound)
				break;
			else if (charArray[i] == ' ') {
				end = i;
			} else {
				start = i;
				validCharFound = true;
			}
		}

		if (!validCharFound)
			return 0;

		return end <= start ? charArray.length - start : end - start;
	}

}
