/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0258AddDigits {

	// saw solution
	public int addDigits(int num) {
		return num == 0 ? 0 : 1 + (num - 1) % 9;
	}
}
