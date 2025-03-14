/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0190ReverseBits {

	// you need treat n as an unsigned value
	public int reverseBits(int n) {
		// 00000000000000000000000000000001
		// 00000000000000000000000000000010
		// 10000000000000000000000000000000
		// 00000000000000000000000000000000
		// 11111111111111111111111111111111
		// 10101010101010101010101010101010
		// 10000000000000000000000000000001
		int reverse = 0;
		int i = 31;

		if ((n & 1) == 1) {
			reverse = 1;
		}

		while (i >= 0) {
			if ((n & 1) == 1)
				reverse += (int) Math.pow(2, i) * (n & 1);
			n = n >> 1;
			i--;
		}

		return reverse;
	}
}
