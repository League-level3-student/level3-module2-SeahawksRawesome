package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	public static boolean intArraySorted(int[] arrayint) {
		for (int i = 0; i < arrayint.length; i++) {
			if (i + 1 >= arrayint.length) {
				break;
			} else {
				if (arrayint[i] > arrayint[i + 1]) {
					return false;
				} else {

				}
			}

		}
		return true;

	}
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		Random rand = new Random();
		int temp = 0;
		while(!intArraySorted(array)) {
			display.updateDisplay();
				int q = rand.nextInt(array.length);
				int c = rand.nextInt(array.length);
				temp = array[c];
				array[c] = array[q];
				array[q] = array[c];
			}
		}
		
	}

