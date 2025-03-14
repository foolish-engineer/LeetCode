/**
 * 
 */
package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mmcgarg
 *
 */
public class Problem0202HappyNumber {

	public boolean isHappy(int n) {

		// 0
		// 1
		// 18
		// 20
		boolean happy = true;
		int temp = 0;
		Set<Integer> a = new HashSet<>();
		if (n == 1) {
			happy = true;
		} else if (n == 0) {
			happy = false;
		} else {
			while (temp != 1) {
				while (n != 0) {
					temp = temp + (n % 10) * (n % 10);
					n = n / 10;
				}

				if (a.contains(temp)) {
					return false;
				}

				if (temp != 1) {
					n = temp;
					temp = 0;
					a.add(n);
				}
			}
		}

		return happy;
	}
}
