package Arrays;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] d = {10,30,20,45,33};
		Arrays.sort(d);
		System.out.println(d[d.length-2]);
		
	}

}
