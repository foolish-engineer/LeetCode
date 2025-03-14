package leetcode;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 */
public class Problem0027RemoveElement {

	private static final Logger logger = LogManager.getLogger(Problem0027RemoveElement.class);

	private Problem0027RemoveElement() {

	}

	public static int removeElement(int[] nums, int val) {
		logger.info("Input numbers: {}", Arrays.asList(nums));

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int i = 0;

		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}

		logger.info("Output numbers: {}", Arrays.asList(nums));

		return i;
	}
}
