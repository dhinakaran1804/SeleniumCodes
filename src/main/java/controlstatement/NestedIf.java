package controlstatement;

public class NestedIf {

	public static void main(String[] args) {

		int age = 5;

		if (age >= 18 && age < 60)
			System.out.println("Guy is Adult");
		else if (age < 18) {
			if (age < 10) {							//Nested IF
				System.out.println("Guy is Kid");
			} else
				System.out.println("Guy is Minor");
		} else
			System.out.println("Guy is Senior");

	}

}
