/**
 * 
 */
package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author mmcgarg
 *
 */
public class Problem0205IsomorphicStrings {

	// egg, add
	// foo, bar
	// paper, title
	// null, null
	// null, a
	// a, null
	// abc, xyz
	// aaa, aaa
	// aaa, bbb
	public boolean isIsomorphic(String s, String t) {
		boolean isomorphic = true;

		Map<Character, Character> map = new HashMap<>();
		Set<Character> set = new HashSet<>();
		Character temp = null;

		for (int i = 0; i < s.length(); i++) {
			temp = map.get(s.charAt(i));
			if (temp == null && !set.contains(t.charAt(i))) {
				map.put(s.charAt(i), t.charAt(i));
				set.add(t.charAt(i));
			} else if (temp == null || temp != t.charAt(i)) {
				isomorphic = false;
				break;
			}
		}

		return isomorphic;
	}
}
