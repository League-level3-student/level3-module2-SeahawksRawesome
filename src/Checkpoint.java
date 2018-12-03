public class Checkpoint {

	public static void main(String[] args) {
		double[] sort = { 2.4, 4.7, 3.3, 2.9, 1.2, 5.2, 13.7 };
		sort(sort);
		int[] find = { 1, 2, 3, 4, 13, 27, 14, 15, 65, 323, 53, 29, 234 };
		int key = 1;
	}

	public static double[] sort(double[] sorter) {
		for (int j = 0; j < sorter.length - 1; j++) {
			for (int i = 0; i < sorter.length - 1; i++) {
				double swap = 0;
				if (i + 1 > sorter.length) {
					break;
				}
				if (sorter[i] > sorter[i + 1]) {
					swap = sorter[i];
					sorter[i] = sorter[i + 1];
					sorter[i + 1] = swap;
				}
			}
		}
		return sorter;

	}

	public static boolean find(int[] finder, int key) {

		return false;
	}

}
