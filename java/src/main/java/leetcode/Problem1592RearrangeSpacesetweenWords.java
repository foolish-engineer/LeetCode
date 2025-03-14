/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem1592RearrangeSpacesetweenWords {

	// " practice"
	// " practice "
	// "practice "
	// " " - invalid test case
	// "a a a a "
	// "a b c d"
	public String reorderSpaces(String text) {
		char[] newStr = new char[text.length()];
		String[] splitStr = text.split(" ");
		int wordCount = 0;
		int spaceCount = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				spaceCount++;
			}
		}

		for (String word : splitStr) {
			if (!word.trim().isEmpty()) {
				wordCount++;
			}
		}

		int space = wordCount <= 1 ? spaceCount : spaceCount / (wordCount - 1);
		int extraSpace = wordCount <= 1 ? 0 : spaceCount % (wordCount - 1);
		int k = 0;

		for (String word : splitStr) {
			if (!word.trim().isEmpty()) {
				for (int i = 0; i < word.trim().length(); i++) {
					newStr[k++] = word.trim().charAt(i);
				}

				for (int i = 0; k < text.length() && i < space; i++) {
					newStr[k++] = ' ';
				}
			}
		}

		for (int i = 0; k < text.length() && i < extraSpace; i++) {
			newStr[k++] = ' ';
		}

		return new String(newStr);
	}
}
