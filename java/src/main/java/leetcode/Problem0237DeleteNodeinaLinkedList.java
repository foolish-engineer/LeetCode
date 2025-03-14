/**
 * 
 */
package leetcode;

/**
 * @author mmcgarg
 *
 */
public class Problem0237DeleteNodeinaLinkedList {

	public void deleteNode(ListNode node) {
		ListNode secondLast = null;
		while (node != null) {
			ListNode a = node.next;
			if (a != null) {
				node.val = a.val;
			} else {
				secondLast.next = null;
			}
			secondLast = node;
			node = node.next;
		}
	}
}
