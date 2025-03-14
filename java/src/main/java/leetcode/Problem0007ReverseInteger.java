package leetcode;

/**
 * @author mmcgarg
 *
 *         link: https://leetcode.com/problems/reverse-integer/
 *
 */
public class Problem0007ReverseInteger {

	public static int reverse(int x) {
		int reverse = 0;
		int temp;

		try {
			if (x <= Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
				return reverse;
			} else {
				while (x != 0) {
					temp = x % 10;
					reverse = Math.addExact(Math.multiplyExact(reverse, 10), temp);
					x = x / 10;
				}
			}
		} catch (ArithmeticException e) {
			reverse = 0;
		}

		return reverse;
	}
}
