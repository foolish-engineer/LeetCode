package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0021MergeTwoSortedListsTest {

	@Test
	public void mergeTwoListsTest() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode actual = Problem0021MergeTwoSortedLists.mergeTwoLists(l1, l2);

		assertEquals(actual.val, 1);
		assertEquals(actual.val, 1);
		actual = actual.next;
		assertEquals(actual.val, 1);
	}

	@Test
	public void mergeTwoListsTest2() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = null;
		ListNode actual = Problem0021MergeTwoSortedLists.mergeTwoLists(l1, l2);

		assertEquals(actual.val, 1);
	}

	@Test
	public void mergeTwoListsTest3() {
		ListNode l1 = null;
		ListNode l2 = new ListNode(2);
		ListNode actual = Problem0021MergeTwoSortedLists.mergeTwoLists(l1, l2);

		assertEquals(actual.val, 2);
	}

	@Test
	public void mergeTwoListsTest4() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(2);
		ListNode actual = Problem0021MergeTwoSortedLists.mergeTwoLists(l1, l2);

		assertEquals(actual.val, 1);
		actual = actual.next;
		assertEquals(actual.val, 1);
		actual = actual.next;
		assertEquals(actual.val, 2);
		actual = actual.next;
		assertEquals(actual.val, 4);
	}

	@Test
	public void mergeTwoListsTest5() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		ListNode actual = Problem0021MergeTwoSortedLists.mergeTwoLists(l1, l2);

		assertEquals(actual.val, 1);
		actual = actual.next;
		assertEquals(actual.val, 1);
		actual = actual.next;
		assertEquals(actual.val, 2);
		actual = actual.next;
		assertEquals(actual.val, 3);
		actual = actual.next;
		assertEquals(actual.val, 4);
		actual = actual.next;
		assertEquals(actual.val, 4);
	}

	@Test
	public void mergeTwoListsTest6() {
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(1);
		ListNode actual = Problem0021MergeTwoSortedLists.mergeTwoLists(l1, l2);

		assertEquals(actual.val, 1);
		assertEquals(actual.next.val, 5);
	}

	@Test
	public void mergeTwoListsTest7() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode actual = Problem0021MergeTwoSortedLists.mergeTwoLists(l1, l2);

		assertEquals(actual.val, 1);
		actual = actual.next;
		assertEquals(actual.val, 2);
	}

	@Test
	public void mergeTwoListsTest8() {
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(2);
		l2.next.next = new ListNode(4);
		ListNode actual = Problem0021MergeTwoSortedLists.mergeTwoLists(l1, l2);

		assertEquals(actual.val, 1);
		actual = actual.next;
		assertEquals(actual.val, 2);
		actual = actual.next;
		assertEquals(actual.val, 4);
		actual = actual.next;
		assertEquals(actual.val, 5);
	}

	@Test
	public void mergeTwoListsTest9() {
		ListNode next = null;
		ListNode l1 = new ListNode(-4);
		ListNode l2 = new ListNode(-9);
		next = l2;
		next.next = new ListNode(-8);
		next = next.next;
		next.next = new ListNode(-6);
		next = next.next;
		next.next = new ListNode(-6);

		ListNode actual = Problem0021MergeTwoSortedLists.mergeTwoLists(l1, l2);

		assertEquals(actual.val, -9);
		actual = actual.next;
		assertEquals(actual.val, -8);
		actual = actual.next;
		assertEquals(actual.val, -6);
		actual = actual.next;
		assertEquals(actual.val, -6);
		actual = actual.next;
		assertEquals(actual.val, -4);
	}

	@Test
	public void mergeTwoListsTest10() {
		ListNode next = null;
		ListNode l1 = new ListNode(1);
		next = l1;
		next.next = new ListNode(5);
		next = next.next;
		next.next = new ListNode(8);
		ListNode l2 = new ListNode(9);

		ListNode actual = Problem0021MergeTwoSortedLists.mergeTwoLists(l1, l2);

		assertEquals(actual.val, 1);
		actual = actual.next;
		assertEquals(actual.val, 5);
		actual = actual.next;
		assertEquals(actual.val, 8);
		actual = actual.next;
		assertEquals(actual.val, 9);
	}
}
