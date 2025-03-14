/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0283MoveZeroes {

	// [0,1,0,3,12]
	// [0,0,0,0,0]
	// [0]
	// []
	// [1]
	// [1,2,3,4,5]
	// [0,0,0,0,1,2,3,4]
	// [1,2,3,4,0,0,0,0]
	public void moveZeroes(int[] nums) {
		int zeroCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				if (zeroCount > 0) {
					nums[i - zeroCount] = nums[i];
					nums[i] = 0;
				}
			} else {
				zeroCount++;
			}
		}
	}
}
