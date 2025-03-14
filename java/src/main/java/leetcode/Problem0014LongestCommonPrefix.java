package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 *         link: https://leetcode.com/problems/longest-common-prefix
 *
 */
public class Problem0014LongestCommonPrefix {
	private static final Logger logger = LogManager.getLogger(Problem0014LongestCommonPrefix.class);

	public static String longestCommonPrefix(String[] strs) {
		Integer minLength = null;
		String minLengthString = null;

		for (int i = 0; i < strs.length; i++) {
			if (minLength == null || minLength > strs[i].length()) {
				minLength = strs[i].length();

				minLengthString = strs[i];
			}
		}

		logger.info("Min length is: {}", minLength);
		logger.info("Min length string is: {}", minLengthString);

		if (minLength == null) {
			return "";
		}

		String prefix = null;
		boolean matchFound = true;

		for (int i = minLength; i > 0; i--) {
			matchFound = true;
			prefix = minLengthString.substring(0, i);
			for (int j = 0; j < strs.length; j++) {
				if (!strs[j].startsWith(prefix)) {
					matchFound = false;
					break;
				}
			}
			if (matchFound) {
				return prefix;
			}
		}

		return "";
	}
}
