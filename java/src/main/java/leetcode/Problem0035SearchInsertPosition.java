/**
 * 
 */
package leetcode;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 */
public class Problem0035SearchInsertPosition {

	private static final Logger logger = LogManager.getLogger(Problem0035SearchInsertPosition.class);

	private Problem0035SearchInsertPosition() {

	}

	public static int searchInsert(int[] nums, int target) {
		logger.info("Input numbers: {}", Arrays.asList(nums));
		logger.info("Target number: {}", Arrays.asList(target));

		if (nums.length == 0)
			return 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}

		return nums.length;
	}
}
