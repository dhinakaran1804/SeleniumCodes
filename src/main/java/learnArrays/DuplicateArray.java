package learnArrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] arr = {10,12,13,14,14,10,16,18,21,12,13};
//		int[] aar = {4,3,5,2};	
		
		//Arrays.sort(aar);		
		
		//System.out.println(aar);		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println("Duplicate values are " + arr[i] );					
				}
			}
		}

	}

}
