package iomethod;

public class OutputFromAMethod {

	public int add(int a, int b) {
		int addition = a + b;
		System.out.println(addition);
		return addition; // --> Should be end of the method & Only one.
	}

	public double sub(int a, int b, double c) {
		double subraction = a + b - c;
		System.out.println(subraction);
		return subraction;
	}

	public static void main(String[] args) {
		OutputFromAMethod value = new OutputFromAMethod();

		int addition1 = value.add(10, 10);
		System.out.println(addition1 + 10);

		double subraction1 = value.sub(10, 220, 75.80);
		System.out.println(subraction1 - 10);

	}

}