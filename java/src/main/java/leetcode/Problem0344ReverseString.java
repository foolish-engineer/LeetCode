/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0344ReverseString {

	// hello
	// hell
	// aaaa
	// abcd
	// empty
	// null
	// a
	// ab
	public void reverseString(char[] s) {
		int low = 0;
		int high = s.length - 1;

		while (low < high) {
			char temp = s[low];
			s[low] = s[high];
			s[high] = temp;

			low++;
			high--;
		}
	}
}
