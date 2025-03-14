/**
 * 
 */
package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 *         This is not an efficient solution. This is a fibonacci series problem
 *         so solve it that way.
 *
 */
public class Problem0070ClimbingStairs {
	private static final Logger logger = LogManager.getLogger(Problem0070ClimbingStairs.class);

	private Problem0070ClimbingStairs() {

	}

	public static int climbStairs(int n) {
		logger.info("Stairs to climb: {}", n);

		int count = 0;

		if (n >= 2) {
			count += climbStairs(n - 2);
			count += climbStairs(n - 1);
		} else if (n >= 1) {
			count += climbStairs(n - 1);
		} else {
			count++;
		}

		return count;
	}

}
