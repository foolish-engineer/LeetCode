/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0292NimGame {

	public boolean canWinNim(int n) {
		if (n % 4 == 0) {
			return false;
		} else {
			return true;
		}
	}
}
