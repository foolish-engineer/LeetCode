/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0326PowerofThree {

	public boolean isPowerOfThree(int n) {
		if (n <= 0 || n % 2 == 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		while (n != 0) {
			if (n % 3 != 0) {
				return false;
			}

			n = n / 3;

			if (n == 3 || n == 1) {
				return true;
			}
		}

		return true;
	}
}
