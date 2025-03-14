/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0206ReverseLinkedList {

	public ListNode reverseList(ListNode head) {
		ListNode previous = null;
		ListNode temp = null;

		while (head != null) {
			temp = head;
			head = head.next;
			temp.next = previous;
			previous = temp;
		}

		head = previous;

		return head;
	}
}
