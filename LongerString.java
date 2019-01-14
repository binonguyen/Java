//# Write a method longer_string(str1, str2) that takes in two strings and returns the longer of the two strings. In the case of a tie, the method should return the first string.
//# puts longer_string("app", "academy") # => "academy"
//# puts longer_string("summer", "fall") # => "summer"
//# puts longer_string("hello", "world") # => "hello"

public class LongerString {
	public static String longer_string(String a, String b) {
		if(a.length() > b.length()) {
			return a;
		}else if (a.length() == b.length()){
			return a;
		}else {
			return b;
		}
	}
	public static void main(String[] args) {
		System.out.println(longer_string("app", "academy"));

	}

}
