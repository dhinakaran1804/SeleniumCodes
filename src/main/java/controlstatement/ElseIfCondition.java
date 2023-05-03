package controlstatement;

public class ElseIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 99;

		if (age >= 18 && age < 60)							//If first one is false then only it will move to 
															//Second condition. It reduce the time. Where ever the condition is true, it will stop there.
			System.out.println("Guy is Adult");

		else if (age < 18)
			System.out.println("Guy is Minor");

		else 
			System.out.println("Guy is Senior");			// If two statement is wrong it will take the default value, present in else.

	}

}
