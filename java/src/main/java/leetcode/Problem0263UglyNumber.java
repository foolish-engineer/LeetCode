/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0263UglyNumber {

	// saw solution
	public boolean isUgly(int num) {
		for (int i = 2; i < 6 && num > 0; i++)
			while (num % i == 0)
				num /= i;
		return num == 1;
	}
}
