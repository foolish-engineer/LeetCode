/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0083RemoveDuplicatesFromSortedList {

	private Problem0083RemoveDuplicatesFromSortedList() {

	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode start = head;
		ListNode result = head;
		head = head.next;

		while (head != null) {
			if (start.val != head.val) {
				start.next = head;
				start = start.next;
			}
			head = head.next;
		}

		start.next = null;

		return result;
	}
}
