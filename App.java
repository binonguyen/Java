import java.util.Scanner;
public class App {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		double num1 = keyboard.nextDouble();
		
		System.out.print("Enter the operater +, -, *, / : ");
		String op = keyboard.next();
		
		System.out.print("Enter 2nd number : ");
		double num2 = keyboard.nextDouble();

		if(op.equals("+")) {
			System.out.println(num1+num2);
		}else if(op.equals("-")) {
			System.out.println(num1-num2);
		}else if(op.equals("*")) {
			System.out.println(num1*num2);
		}else if(op.equals("/")) {
			System.out.println(num1/num2);
		}else {
			System.out.println("Invalid Input");
		}



	}
}
