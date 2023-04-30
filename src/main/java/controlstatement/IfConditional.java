package controlstatement;

public class IfConditional {

	public void oneif(int a) {

		if (a > 10) {
			System.out.println("A value is more then 10");
		}

	}

	public void twoif(int a) {

		if (a > 10) {
			System.out.println("A value is more then 10");
		}
		System.out.println("A value is less then 10");

	}

	public static void main(String[] args) {
		IfConditional iff = new IfConditional();
		iff.oneif(15);
		iff.twoif(8);
	}

}
