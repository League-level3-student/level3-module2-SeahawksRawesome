package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			} else {

			}
		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)) {
				count += 1;
			} else {

			}
		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		Double greatest = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > greatest) {
				greatest = peeps.get(i);
			} else {

			}
		}
		return greatest;
	}

	public static String findLongestWord(List<String> words) {
		String greatest = words.get(0);
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > greatest.length()) {
				greatest = words.get(i);
			} else {

			}
		}
		return greatest;
	}

	public static boolean containsSOS(List<String> message) {
		String answer = " ... --- ... ";
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).equals(answer)) {
				return true;
			} else {

			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		double swap = 0;
		double result = 0;
		double result2 = 0;
		for (int i = 0; i < results.size() - 1; i++) {
			for (int j = 0; j < results.size() - 1; j++) {

				result = results.get(j);
				result2 = results.get(j + 1);
				if (result > result2) {
					results.set(j, result2);
					results.set(j + 1, result);

				} else {

				}
			}
		}
		return results;
	}
	public static List<String> sortDNA(List<String> sequence){
		String swap1 = null;
		String swap2 = null;
		for (int j = 0; j < sequence.size() -1; j++) {
			for( int i = 0; i < sequence.size() -1; i++) {
				
				swap1 = sequence.get(i);
				swap2 = sequence.get(i + 1);
				if(swap1.length() > swap2.length()) {
					sequence.set(i, swap2);
					sequence.set(i+1, swap1);
				}
			}
		}
		return sequence;
	}
}
