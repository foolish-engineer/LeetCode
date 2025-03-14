/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 */
public class Problem0119PascalTriangle {
	private static final Logger logger = LogManager.getLogger(Problem0119PascalTriangle.class);

	private Problem0119PascalTriangle() {

	}

	public static List<Integer> getRow(int rowIndex) {
		List<Integer> result = new ArrayList<>();
		logger.info("Row index to return: {}", rowIndex);

		for (int i = 0; i < rowIndex + 1; i++) {
			result.add(1);
			for (int j = i - 1; j > 0; j--) {
				result.set(j, result.get(j - 1) + result.get(j));
			}
		}

		logger.info("Result: {}", result);
		return result;
	}
}
