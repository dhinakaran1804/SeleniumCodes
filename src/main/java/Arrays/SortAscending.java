package Arrays;

import java.util.Arrays;

public class SortAscending {

	public static void main(String[] args) {
		int[] d = { 20, 3, 2, 7, 12, 6 };
		int sort = d.length;
		Arrays.sort(d);

		for (int i = 0; i < sort; i++) {
			System.out.println(d[i]);
		}

	}

}
