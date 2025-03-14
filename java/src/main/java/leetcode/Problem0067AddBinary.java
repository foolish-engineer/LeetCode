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
public class Problem0067AddBinary {
	private static final Logger logger = LogManager.getLogger(Problem0067AddBinary.class);

	private Problem0067AddBinary() {

	}

	public static String addBinary(String a, String b) {
		logger.info("Input strings are: {} and {}", a, b);

		StringBuilder sb = new StringBuilder();

		int carry = 0;
		int i = a.length() - 1;
		int j = b.length() - 1;

		while (i >= 0 || j >= 0) {
			char aChar = '0';
			char bChar = '0';
			if (i >= 0)
				aChar = a.charAt(i--);
			if (j >= 0)
				bChar = b.charAt(j--);

			if (bChar == '1' && aChar == '1') {
				if (carry != 0) {
					sb.append(1);
				} else {
					sb.append(0);
				}
				carry = 1;
			} else if (bChar == '0' && aChar == '0') {
				if (carry == 0)
					sb.append(0);
				else
					sb.append(1);
				carry = 0;
			} else {
				if (carry == 1) {
					sb.append(0);
					carry = 1;
				} else {
					sb.append(1);
					carry = 0;
				}
			}
		}

		if (carry != 0) {
			sb.append(1);
		}

		logger.info("Output string: {}", sb);

		return sb.reverse().toString();
	}

}
