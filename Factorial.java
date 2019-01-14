//# Write a method factorial(num) that takes in a number num and returns the product of all numbers from 1 up to and including num.
//#
//# puts factorial(3) # => 6, because 1 * 2 * 3 = 6
//# puts factorial(5) # => 120, because 1 * 2 * 3 * 4 * 5 = 120
public class Factorial {
	public static int factorial(int nums) {
		int total = 1;
		for ( int i = 1; i <= nums;i++ ) {
			total *= i;
		}
		return total;
	}
	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(factorial(5));

	}

}
