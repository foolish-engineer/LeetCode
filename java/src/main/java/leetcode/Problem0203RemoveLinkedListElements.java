/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0203RemoveLinkedListElements {

	public ListNode removeElements(ListNode head, int val) {
		// 1->2->6->3->4->5->6 / 6 // first & last
		// 1->2->6->3->4->5->6 / 1 // first
		// 1->2->6->3->4->5->6 / 3 // middle
		// 1->2->6->3->4->5->6 / 8 // no
		// 1-> / 1
		// 1->1 / 1
		// [1,2,1] / 1
		// null / 1
		ListNode previous = null;
		ListNode validStart = null;
		while (head != null) {
			if (head.val != val) {
				if (previous != null) {
					previous.next = head;
					previous = previous.next;
				} else {
					previous = head;
				}

				if (validStart == null) {
					validStart = previous;
				}
				head = head.next;
			} else {
				head = head.next;
			}
		}

		if (previous != null) {
			previous.next = null;
		}

		return validStart;
	}
}
