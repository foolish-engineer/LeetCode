/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem1588SumofAllOddLengthSubarrays {

	public int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i += 2) {
			for (int j = 0; j < arr.length - i; j++) {
				for (int k = j; k <= j + i; k++) {
					sum += arr[k];
				}
			}
		}

		return sum;
	}
}
