package leetcode;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

public class Problem0119PascalTriangleTest {

	@Test
	public void getRowTest() {
		List<Integer> actual = Problem0119PascalTriangle.getRow(0);
		assertEquals(actual.toString(), "[1]");
	}

	@Test
	public void getRowTest2() {
		List<Integer> actual = Problem0119PascalTriangle.getRow(1);
		assertEquals(actual.toString(), "[1, 1]");
	}

	@Test
	public void getRowTest3() {
		List<Integer> actual = Problem0119PascalTriangle.getRow(2);
		assertEquals(actual.toString(), "[1, 2, 1]");
	}

	@Test
	public void getRowTest4() {
		List<Integer> actual = Problem0119PascalTriangle.getRow(3);
		assertEquals(actual.toString(), "[1, 3, 3, 1]");
	}

	@Test
	public void getRowTest5() {
		List<Integer> actual = Problem0119PascalTriangle.getRow(4);
		assertEquals(actual.toString(), "[1, 4, 6, 4, 1]");
	}
}
