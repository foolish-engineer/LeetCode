/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 *         link: https://leetcode.com/problems/single-number
 *
 */
public class Problem0136SingleNumber {
	private static final Logger logger = LogManager.getLogger(Problem0136SingleNumber.class);

	private Problem0136SingleNumber() {

	}

	public static int singleNumber(int[] nums) {
		logger.info("Number1 list: {}", Arrays.asList(nums));

		Set<Integer> unique = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (unique.contains(nums[i])) {
				unique.remove(nums[i]);
			} else {
				unique.add(nums[i]);
			}
		}

		return unique.iterator().next();

	}
}
