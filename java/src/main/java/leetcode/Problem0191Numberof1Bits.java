/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0191Numberof1Bits {
	
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		// 01
		// 11
		// 111
		// 1011
		// 11111111111111111111111111111111
		// 11111111111111111111111111111101
		// 00000000000000000000000010000000
		// 00000000000010000000000010000000

		int total = 0;

		if (n < 0) {
			n = 2147483647 + n + 1;
			total = 1;
		}

		while (n > 0) {
			int x = n % 2;
			total += x;
			n = n / 2;
		}

		return total;
	}
}
