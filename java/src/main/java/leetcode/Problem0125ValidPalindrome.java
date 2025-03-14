/**
 * 
 */
package leetcode;

import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 *         link: https://leetcode.com/problems/valid-palindrome/
 *
 */
public class Problem0125ValidPalindrome {
	private static final Logger logger = LogManager.getLogger(Problem0125ValidPalindrome.class);

	private Problem0125ValidPalindrome() {

	}

	public static boolean isPalindrome(String s) {
		logger.info("Input string: {}", s);
		int i = 0;
		int j = s.length() - 1;
		String regex = "[a-zA-Z0-9]";

		while (i < j) {
			if (!Pattern.matches(regex, s.substring(i, i + 1))) {
				i++;
				continue;
			} else if (!Pattern.matches(regex, s.substring(j, j + 1))) {
				j--;
				continue;
			} else if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}
}
