package leetcode;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;

public class Problem0083RemoveDuplicatesFromSortedListTest {

	@Test
	public void deleteDuplicatesTest() {
		ListNode l1 = null;
		ListNode actual = Problem0083RemoveDuplicatesFromSortedList.deleteDuplicates(l1);
		assertNull(actual);
	}

	@Test
	public void deleteDuplicatesTest1() {
		ListNode head = new ListNode(1);
		ListNode actual = Problem0083RemoveDuplicatesFromSortedList.deleteDuplicates(head);
		assertEquals(actual.val, 1);
		actual = actual.next;
		assertNull(actual);
	}

	@Test
	public void deleteDuplicatesTest2() {
		ListNode next = null;
		ListNode head = new ListNode(1);
		next = head;
		next.next = new ListNode(1);
		next = next.next;
		next.next = new ListNode(2);

		ListNode actual = Problem0083RemoveDuplicatesFromSortedList.deleteDuplicates(head);

		assertEquals(actual.val, 1);
		actual = actual.next;
		assertEquals(actual.val, 2);
		actual = actual.next;
		assertNull(actual);
	}

	@Test
	public void deleteDuplicatesTest3() {
		ListNode next = null;
		ListNode head = new ListNode(1);
		next = head;
		next.next = new ListNode(1);
		next = next.next;
		next.next = new ListNode(2);
		next = next.next;
		next.next = new ListNode(3);
		next = next.next;
		next.next = new ListNode(3);

		ListNode actual = Problem0083RemoveDuplicatesFromSortedList.deleteDuplicates(head);

		assertEquals(actual.val, 1);
		actual = actual.next;
		assertEquals(actual.val, 2);
		actual = actual.next;
		assertEquals(actual.val, 3);
		actual = actual.next;
		assertNull(actual);
	}
}
