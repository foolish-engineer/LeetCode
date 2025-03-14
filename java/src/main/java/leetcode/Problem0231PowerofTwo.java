/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0231PowerofTwo {

	public boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		while (n != 0) {
			if (n % 2 != 0) {
				return false;
			}

			n = n / 2;

			if (n == 2 || n == 1) {
				return true;
			}
		}

		return true;
	}
}
