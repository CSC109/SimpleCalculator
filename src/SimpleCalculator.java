import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("This is a calculator!");
		System.out.println("Enter in operand 1:");
		int operand1 = keyboardInput.nextInt();
		System.out.println("Enter in operand 2:");
		int operand2 = keyboardInput.nextInt();
		System.out.println("Enter in desired operator (choices are +, -, *, and /");
		keyboardInput.nextLine();
		char operator = keyboardInput.nextLine().charAt(0);
		
		int result = 0;
		if (operator == '+') {
			result = operand1 + operand2;
		}
		else if (operator == '-') {
			result = operand1 - operand2;
		}
		else if (operator == '*') {
			result = operand1 - operand2;
		}
		else if (operator == '/') {
			result = operand1 - operand2;
		}
		else {
			System.out.println("You didn't follow directions sad :(");
		}
		
		System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
	}
}
