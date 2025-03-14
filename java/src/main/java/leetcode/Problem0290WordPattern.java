/**
 * 
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mmcgarg
 *
 */
public class Problem0290WordPattern {

	// size of both can be different so match should be false
	// empty pattern not allowed
	// empty string not allowed
	// a a - true
	// "abba", s = "dog cat cat dog" - true
	// "abba", s = "dog cat cat fish" - false
	// "aaaa", s = "dog cat cat dog" - false
	// "bbbb", s = "dog cat cat dog" - false
	// "bbbb", s = "dog dog dog dog" - true
	// a, hello - true
	// ab, hello t - true
	// aba, hello t - false
	// abc, a b c - true
	// "dog cat cat dog " invalid because of trailing space
	// a && b - true
	// aa && bc - false
	// aa && bb - false
	// // "abba", s = "dog dog dog dog" - false
	public boolean wordPattern(String pattern, String s) {
		boolean match = true;
		Map<Character, String> map = new HashMap<>();

		if (pattern.length() != s.split(" ").length) {
			return false;
		}

		String[] splitArray = s.split(" ");

		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			String str = splitArray[i];
			if (map.containsKey(c)) {
				match = map.get(c).equals(str);
				if (!match)
					break;
			} else {
				if (map.values().contains(str)) {
					match = false;
					break;
				}
				map.put(c, str);
			}
		}

		return match;
	}
}
