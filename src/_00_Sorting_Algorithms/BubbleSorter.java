package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		
		int temp = 0;
		for(int j = 0; j < array.length; j++) {
			display.updateDisplay();
		for(int i = 0; i < array.length; i++) {
			display.updateDisplay();
			if(i + 1 > array.length - 1 ) {
				break;
			}
			if(array[i] > array[i+1]) {
				
				temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
			else {
				
			}
		}
		}
	}
	
}
