/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 *         link: https://leetcode.com/problems/linked-list-cycle/
 *
 */
public class Problem0141LinkedListCycle {

	private Problem0141LinkedListCycle() {

	}

	public static boolean hasCycle(ListNode head) {
		ListNode dummy = new ListNode(-1);
		ListNode temp = null;

		while (head != null) {
			temp = head;

			if (head.next == dummy) {
				return true;
			}

			head = head.next;
			temp.next = dummy;
		}

		return false;

	}
}
