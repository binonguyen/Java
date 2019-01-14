//# Write a method larger_number(num1, num2) that takes in two numbers and returns the larger of the two numbers.
//# puts larger_number(42, 28)   # => 42
//# puts larger_number(99, 100)  # => 100
public class LargerNum {
	public static int larger_number(int a, int b) {
		if (a> b) {
			return a;
		}else {
			return b;
		}
	}
	public static void main(String[] args) {
		System.out.print(larger_number(99, 100));

	}

}
