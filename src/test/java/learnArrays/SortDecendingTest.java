package learnArrays;

import java.util.Arrays;

public class SortDecendingTest {

	public static void main(String[] args) {
		int[] d = { 20, 3, 2, 7, 12, 6 };
		int sort = d.length;
		Arrays.sort(d);

		for (int i = sort-1; i >=0; i--) {
			System.out.println(d[i]);
		}

	}

}
