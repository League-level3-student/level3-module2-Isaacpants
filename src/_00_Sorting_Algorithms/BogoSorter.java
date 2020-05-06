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
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.

	

	@Override

	void sort(int[] a, SortingVisualizer display) {
		boolean shouldSwap = false;
		while (true) {
			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] > a[i + 1]) {
					shouldSwap = true;
					break;
				}
			}
				if (shouldSwap) {

					Random r = new Random();
					int b = r.nextInt(a.length);
					int c = r.nextInt(a.length);
					int d = a[b];
					a[b] = a[c];
					a[c] = d;

					shouldSwap = false;

				} else {
					break;
				}
				display.updateDisplay();
			
		}
	}
}
