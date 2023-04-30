package iomethod;
public class InputToAMethod {

	public void sum(int num1, int num2, float num3) { // --> Parameterized method

		System.out.println(num1 + num2 - num3);
		System.out.println(num1-num2);
		System.out.println("Text in sub method");
	}

	private void getEmployeeInfo(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}

	private void intAndString(int a, int b, String adding) {
		System.out.println(a + b + " " + adding);
	}

	public static void main(String[] args) {
		InputToAMethod liao = new InputToAMethod();
		
		liao.sum(50, 70, 10.50f); // --> Argument
		liao.getEmployeeInfo("Dhinakaran", "S");
		liao.intAndString(10, 15, "Added");
		System.out.println("Text in main method");
	}
}