/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0303RangeSumQueryImmutable {
	int[] nums;

	public void NumArray(int[] nums) {
		this.nums = nums;
	}

	public int sumRange(int i, int j) {
		int sum = 0;
		while (i <= j) {
			sum += nums[i++];
		}

		return sum;
	}
}
