package controlstatement;

public class While {

	public static void main(String[] args) {
		// SUM OF DIGITS
//		345= 3+4+5
		int input = 345;
		int sum = 0; 
		while (input > 0) {

 			int rem = input % 10;
			sum = rem + sum;
			input = input / 10;
		}
		{

			System.out.println(sum);
		}

	}

}
