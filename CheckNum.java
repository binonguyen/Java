//# Write a method number_check(num) that takes in a number and returns a string. The method should return the string 'positive' if the num is positive, 'negative' if the num is negative, and 'zero' if the num is zero.
//# puts number_check(5)    # => "positive"
//# puts number_check(-2)   # => "negative"
//# puts number_check(0)    # => "zero"

public class CheckNum {
	public static String number_check(int num) {
		if (num > 0) {
			return "positive";
		}else if (num < 0){
			return "negative";	
		}else {
			return "zero";
		}
	}
	public static void main(String[] args) {
		System.out.println(number_check(0));

	}

}
