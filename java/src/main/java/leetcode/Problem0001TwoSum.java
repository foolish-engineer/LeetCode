package leetcode;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 *         Problem's details: https://leetcode.com/problems/two-sum/
 *
 */
public class Problem0001TwoSum {
	private static final Logger logger = LogManager.getLogger(Problem0001TwoSum.class);

	public static int[] twoSum(int[] nums, int target) {
		logger.info("Target value is: {}", target);

		Map<Integer, Integer> complimentValues = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (complimentValues.containsKey(nums[i])) {
				return new int[] { complimentValues.get(nums[i]), i };
			}
			complimentValues.put(target - nums[i], i);
		}

		return new int[0];
	}

}