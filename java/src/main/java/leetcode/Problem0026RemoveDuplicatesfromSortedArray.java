package leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 */
public class Problem0026RemoveDuplicatesfromSortedArray {
	private static final Logger logger = LogManager.getLogger(Problem0026RemoveDuplicatesfromSortedArray.class);

	private Problem0026RemoveDuplicatesfromSortedArray() {

	}

	public static int removeDuplicates(int[] nums) {
		logger.info("Input numbers: {}", Arrays.asList(nums));

		if (nums == null || nums.length == 0)
			return 0;
		else if (nums.length == 1)
			return 1;

		int newLength = 1;
		int previous = nums[0];
		Deque<Integer> emptyIndexes = new LinkedList<>();

		for (int i = 1; i < nums.length; i++) {
			if (previous != nums[i]) {
				newLength++;
				if (!emptyIndexes.isEmpty()) {
					nums[emptyIndexes.pop()] = nums[i];
					emptyIndexes.add(i);
				}
			} else {
				emptyIndexes.add(i);
			}
			previous = nums[i];
		}

		logger.info("Output numbers: {}", Arrays.asList(nums));

		return newLength;

	}
}
