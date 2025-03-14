package leetcode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Problem0141LinkedListCycleTest {

	@Test
	public void hasCycleTest() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);

		boolean actual = Problem0141LinkedListCycle.hasCycle(l1);

		assertFalse(actual);
	}

	@Test
	public void hasCycleTest2() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = l1;

		boolean actual = Problem0141LinkedListCycle.hasCycle(l1);

		assertTrue(actual);
	}

	@Test
	public void hasCycleTest3() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = l1;

		boolean actual = Problem0141LinkedListCycle.hasCycle(l1);

		assertTrue(actual);
	}

	@Test
	public void hasCycleTest4() {
		ListNode l1 = new ListNode(1);

		boolean actual = Problem0141LinkedListCycle.hasCycle(l1);

		assertFalse(actual);
	}
}
