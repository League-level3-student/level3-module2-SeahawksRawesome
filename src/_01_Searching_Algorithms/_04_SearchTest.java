package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String words[] = {"Hi", "Hello", "Yeet", "G'Day", "Wasup"};
		assertEquals(1, _00_LinearSearch.linearSearch(words, "Hello"));
		assertEquals(2, _00_LinearSearch.linearSearch(words, "Yeet"));
		assertEquals(0, _00_LinearSearch.linearSearch(words, "Hi"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int array[] = {1, 2, 5, 7, 10, 15, 34};
		assertEquals(2, _01_BinarySearch.binarySearch(array, 0, 6,  5));
		assertEquals(6, _01_BinarySearch.binarySearch(array, 0, 6,  34));
		assertEquals(3, _01_BinarySearch.binarySearch(array, 0, 6,  7));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int array2[] = {2, 4, 6, 8, 10, 12};
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(array2, 2));
		assertEquals(3, _02_InterpolationSearch.interpolationSearch(array2, 8));
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(array2, 6));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int array3[] = {5, 10, 15, 20, 25, 30};
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(array3, 5));
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(array3, 20));
		assertEquals(5, _03_ExponentialSearch.exponentialSearch(array3, 30));
	}
}
