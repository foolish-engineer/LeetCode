package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 */
public class Problem0028ImplementStrStr {

	private static final Logger logger = LogManager.getLogger(Problem0028ImplementStrStr.class);

	private Problem0028ImplementStrStr() {

	}

	public static int strStr(String haystack, String needle) {
		logger.info("Haystack is: {}", haystack);
		logger.info("needle is: {}", needle);
		if (needle == null || needle.length() == 0) {
			return 0;
		}

		char[] haystackArray = haystack.toCharArray();
		char[] needleArray = needle.toCharArray();

		for (int i = 0; i <= haystackArray.length - needleArray.length; i++) {
			if (haystackArray[i] == needleArray[0]) {
				boolean found = checkRemaningChars(haystackArray, needleArray, i, 0);
				if (found)
					return i;

			}
		}

		return -1;
	}

	/**
	 * @param haystackArray
	 * @param needleArray
	 * @param i
	 * @param j
	 * @return
	 */
	private static boolean checkRemaningChars(char[] haystackArray, char[] needleArray, int i, int j) {
		while (true) {
			if (i == haystackArray.length - 1 || j == needleArray.length - 1) {
				if (j != needleArray.length - 1) {
					return false;
				} else {
					break;
				}
			}

			if (haystackArray[++i] != needleArray[++j]) {
				return false;
			}

		}
		return true;
	}
}
