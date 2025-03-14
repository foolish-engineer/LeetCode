/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0268MissingNumber {

	public int missingNumber(int[] nums) {
		int sum = (nums.length) * (nums.length + 1) / 2; // n*(n+1)/2

		for (int i = 0; i < nums.length; i++) {
			sum -= nums[i];
		}

		return sum;

	}
}
