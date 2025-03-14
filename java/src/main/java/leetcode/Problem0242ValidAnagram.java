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
public class Problem0242ValidAnagram {

	// contains space? Yes
	// anagram nagrama
	// car rac
	// dog god
	// hello byebye
	// same length? No
	// anagram nagramaa
	// check for null? No
	// check for empty? Yes
	// 'he llo' 'llo he'
	public boolean isAnagram(String s, String t) {
		Map<Character, Integer> map = new HashMap<>();
		char temp;

		if (s.length() != t.length()) {
			return false;
		}

		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);
			if (map.containsKey(temp)) {
				map.put(temp, map.get(temp) + 1);
			} else {
				map.put(temp, 1);
			}
		}

		for (int i = 0; i < t.length(); i++) {
			temp = t.charAt(i);
			if (map.containsKey(temp)) {
				int count = map.get(temp);
				if (count == 1) {
					map.remove(temp);
				} else {
					map.put(temp, count - 1);
				}
			} else {
				return false;
			}
		}

		if (map.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
