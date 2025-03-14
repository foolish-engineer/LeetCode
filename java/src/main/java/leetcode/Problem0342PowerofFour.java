/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0342PowerofFour {

	public boolean isPowerOfFour(int n) {
		if (n == 1) {
			return true;
		}
		if (n <= 0 || n % 2 != 0) {
			return false;
		}
		while (n != 0) {
			if (n % 4 != 0) {
				return false;
			}

			n = n / 4;

			if (n == 4 || n == 1) {
				return true;
			}
		}

		return true;
	}
}
