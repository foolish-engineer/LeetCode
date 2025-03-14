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
public class Problem0088MergeSortedArray {
	private static final Logger logger = LogManager.getLogger(Problem0088MergeSortedArray.class);

	private Problem0088MergeSortedArray() {

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		logger.info("Number1 list: {}", Arrays.asList(nums1));
		logger.info("Number2 list: {}", Arrays.asList(nums2));

		int emptyCellIndex = m + n - 1;

		while (m > 0 && n > 0) {
			if (nums1[m - 1] >= nums2[n - 1]) {
				nums1[emptyCellIndex--] = nums1[m - 1];
				m--;
			} else {
				nums1[emptyCellIndex--] = nums2[n - 1];
				n--;
			}
		}

		if (n > 0) {
			for (int i = n - 1; i >= 0; i--) {
				nums1[emptyCellIndex--] = nums2[i];
			}

		}

		logger.info("Sorted list: {}", Arrays.asList(nums1));
	}
}
