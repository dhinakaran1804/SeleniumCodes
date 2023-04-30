package calculatorcode;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator C = new Calculator();
		int i = C.add(10, 20);
		int j = C.sub(25, 10);
		System.out.println("Addition value = "+i);
		System.out.println("Subraction value = "+j);

	}

}
