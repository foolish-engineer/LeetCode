/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0172FactorialTrailingZeroes {

	public int trailingZeroes(int n) {
		int trailingZeros = 0;

		while (n > 0) {
			trailingZeros += n / 5;
			n = n / 5;
		}

		return trailingZeros;
	}
}
