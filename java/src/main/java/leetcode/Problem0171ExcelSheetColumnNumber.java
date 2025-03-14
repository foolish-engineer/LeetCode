/**
 * 
 */
package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 *         link: https://leetcode.com/problems/excel-sheet-column-number/
 *
 */
public class Problem0171ExcelSheetColumnNumber {
	private static final Logger logger = LogManager.getLogger(Problem0171ExcelSheetColumnNumber.class);

	public Problem0171ExcelSheetColumnNumber() {
		super();
	}

	public static int titleToNumber(String s) {
		logger.info("Input string: {}", s);

		int column = 0;

		char[] charArray = s.toCharArray();
		int i = 0;
		char temp;

		for (int j = charArray.length - 1; j >= 0; j--) {
			temp = charArray[j];
			column += Math.pow(26, i++) * (temp - 'A' + 1);
		}

		return column;
	}
}
