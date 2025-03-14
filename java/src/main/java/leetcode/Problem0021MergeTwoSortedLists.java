package leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

/**
 * @author mmcgarg
 * 
 *         link: https://leetcode.com/problems/merge-two-sorted-lists/
 *
 */
public class Problem0021MergeTwoSortedLists {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode temp = null;
		ListNode result = null;
		temp = result = new ListNode(-1);

		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				temp.next = l1;
				l1 = l1.next;
			} else if (l1.val > l2.val) {
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}

		if (l1 != null) {
			temp.next = l1;
		} else if (l2 != null) {
			temp.next = l2;
		}

		return result.next;
	}

}
