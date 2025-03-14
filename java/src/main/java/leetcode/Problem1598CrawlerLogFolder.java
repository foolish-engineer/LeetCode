/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem1598CrawlerLogFolder {

	// additional test cases
	// ["../","../","../"]
	// ["./","../","../"]
	// ["./","./","./"]
	// ["d1/","d2/","../","../","./","d3/","../","d31/"]
	// ["d1/","d2/","../","../","./","d3/","../","./","d31/"]
	// ["d1/","d2/","d31/"]
	// ["../","d2/","d31/"]
	// ["d2/","../","d31/"]
	// ["d2/","d31/","../"]
	public int minOperations(String[] logs) {
		int operations = 0;

		for (int i = 0; i < logs.length; i++) {
			if (logs[i].equals("../")) {
				if (operations > 0)
					operations--;
			} else if (!logs[i].equals("./")) {
				operations++;
			}
		}

		return operations;
	}
}
