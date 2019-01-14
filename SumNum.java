//Write a method sum_nums(max) that takes in a number max and returns the sum of all numbers from 1 up to and including max.
//puts sum_nums(4) # => 10, because 1 + 2 + 3 + 4 = 10
//puts sum_nums(5) # => 15


public class SumNum {
	public static int sum_nums(int nums) {
		int total = 0;
		for ( int i = 0; i <= nums;i++ ) {
			total += i;
		}
		return total;
	}
	public static void main(String[] args) {
		System.out.println(sum_nums(4));
		System.out.println(sum_nums(5));

	}

}
