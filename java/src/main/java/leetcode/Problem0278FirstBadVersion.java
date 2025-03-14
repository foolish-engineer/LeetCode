/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0278FirstBadVersion {

	// 1 - 1 1
	// 1 - 5 1
	// 1 - 5 2
	// 1 - 5 3
	// 1 - 5 4
	// 1 - 5 5
	// 1 - 2 1
	// 1 - 2 2
	// 1 - 3 1
	// 1 - 3 2
	// 1 - 3 3
	// 1 - 4 1
	// 1 - 4 2
	// 1 - 4 3
	// 1 - 4 4
	// 2121212121 - 1564564566
	public int firstBadVersion(int n) {

		int low = 1;
		int high = n;
		int mid = low + (high - low) / 2;

		while (low < high) {
			if (isBadVersion(mid)) {
				high = mid;
			} else {
				low = mid + 1;
			}
			mid = low + (high - low) / 2;
		}

		return mid;

	}

	/**
	 * @param mid
	 * @return
	 */
	private boolean isBadVersion(int mid) {
		return false;
	}
}
