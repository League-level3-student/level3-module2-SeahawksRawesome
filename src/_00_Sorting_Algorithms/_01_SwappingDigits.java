package _00_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import javax.xml.transform.Templates;

import org.junit.jupiter.api.Test;

class _01_SwappingDigits {

	@Test
	void test() {
		int[] x = { 5, 6 };
		int[] y = { 6, 5 };
		swapArrayOfTwo(x);
		assertArrayEquals(y, x);

		
		  int[] z = {7, 3, 5, 9, 2}; int[] q = {2, 3, 5, 7, 9}; sortIntArray(z);
		  assertArrayEquals(q, z);
		  
		  int[] m = {7, 3, 9, 5, 2}; assertEquals(5, findMiddle(m));
		 
	}

	// 1. Complete the method so that the first two elements of the array are
	// swapped
	public static void swapArrayOfTwo(int[] arr) {

		int[] temp = new int[arr.length];
		temp[0] = arr[0];
		temp[1] = arr[1];
		arr[0] = temp[1];
		arr[1] = temp[0];
	}

	// 2. Complete the method so that it sorts the array using a bubble sort.
	// Iterate through the array and when you find two elements that are out
	// of order, swap them. Repeat this until the array is in order.
	public static void sortIntArray(int[] arr) {
		//boolean sorted = false;
//		int[] temp = arr.clone();
		int temp = 0;
		for(int j = 0; j < arr.length; j++) {
		for(int i = 0; i < arr.length; i++) {
			if(i + 1 > arr.length - 1 ) {
				break;
			}
			if(arr[i] > arr[i+1]) {
				
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
//				arr[i] = temp[i+1];
//				arr[i+1] = temp[i];
//				temp = arr.clone();
			}
			else {
				
			}
		}
		}
	}


	
	// 3. Complete the method so that it finds the middle number in the array.
	// *Hint* it helps to sort it first.
	// *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		int temp = 0;
		for(int j = 0; j < arr.length; j++) {
		for(int i = 0; i < arr.length; i++) {
			if(i + 1 > arr.length - 1 ) {
				break;
			}
			if(arr[i] > arr[i+1]) {
				
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			else {
				
			}
		}
		}
		int middle = 0;
		int sorted = 0;
		int sorted2 = 0;
		if(arr.length%2 == 0) {
			
		}
		else {
			sorted = arr.length/2;
			middle = arr[sorted];
		}
		return middle;
	}
}
