/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0189RotateArray {
	
	public void rotate(int[] nums, int k) {
		while (k > 0) {
			k--;
			int temp = nums[nums.length - 1];
			int temp2;
			for (int i = 0; i < nums.length; i++) {
				temp2 = nums[i];
				nums[i] = temp;
				temp = temp2;
			}
		}
	}
}
